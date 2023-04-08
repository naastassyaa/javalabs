import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.lviv.iot.algo.part1.filmApp.*;

import java.util.ArrayList;
import java.util.List;

public class VideoManagerTest {
    private final VideoManager videoManager = new VideoManager();

    @Before
    public void init() {
        VideoManager.addVideo(new Film("Титанік", "Джеймс Кемерон", 1997, 56, 12));
        VideoManager.addVideo(new Cartoon("Мавка. Лісова пісня", "Олександра Рубан", 2023, "Фентезі", 12, "Земля", 145, 15));

        VideoManager.addVideo(new Clip("Sad Svit - Силуети Lyrics video", "Sad Novelist", 2022, "Силуети", "Sad Svit", 81000, 3700000));
        VideoManager.addVideo(new TikTok("My Style", "SashaBo", 2023, "Mockingbird", "Fashion", 129, 409, 8048));
    }
    @After
    public void end() {
        videoManager.getVideos().clear();
    }
    @Test
    public void testAdd() {
        ArrayList<Video> list = videoManager.getVideos();
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("Титанік", list.get(0).getTitleOfVideo());
    }

    @Test
    public void testFindAllWithSameDirector() {
        List<Video> result = VideoManager.findAllWithSameDirector("Джеймс Кемерон");
        Assert.assertEquals("Джеймс Кемерон", result.get(0).getDirector());
    }

    @Test
    public void testFindAllWithYearMoreThan() {
        List<Video> result = VideoManager.findAllWithYearMoreThan(2015);
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.get(0).getYear()>2015);
    }
}
