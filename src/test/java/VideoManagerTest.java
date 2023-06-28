
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.filmApp.*;

import java.util.ArrayList;
import java.util.List;

public class VideoManagerTest {
    private final VideoManager videoManager = new VideoManager();

    @BeforeEach
    public void init() {
        VideoManager.addVideo(new Film("Титанік", "Джеймс Кемерон", 1997, 56, 12));
        VideoManager.addVideo(new Cartoon("Мавка. Лісова пісня", "Олександра Рубан", 2023, "Фентезі",  "Земля", 145, 15));

        VideoManager.addVideo(new Clip("Sad Svit - Силуети Lyrics video", "Sad Novelist", 2022, "Силуети", "Sad Svit", 81000, 3700000));
        VideoManager.addVideo(new TikTok("My Style", "SashaBo", 2023, "Mockingbird", 129, 409, 8048));
    }

    @AfterEach
    public void end() {
        videoManager.getVideos().clear();
    }
    @Test
    public void testAdd() {
        ArrayList<Video> list = videoManager.getVideos();
        Assertions.assertEquals(4, list.size());
        Assertions.assertEquals("Титанік", list.get(0).getTitleOfVideo());
    }

    @Test
    public void testFindAllWithSameDirector() {

        List<Video> result = VideoManager.findAllWithSameDirector("Джеймс Кемерон");
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("Джеймс Кемерон", result.get(0).getDirector());
    }

    @Test
    public void testFindAllWithYearMoreThan() {
        List<Video> result = VideoManager.findAllWithYearMoreThan(2015);
        Assertions.assertEquals(3, result.size());
        result.forEach((i) -> Assertions.assertTrue(i.getYear() > 2015));
    }

    @Test
    public void secondTestFindAllWithYearMoreThan() {
        List<Video> result = VideoManager.findAllWithYearMoreThan(3000);
        Assertions.assertEquals(0, result.size());
    }
}
