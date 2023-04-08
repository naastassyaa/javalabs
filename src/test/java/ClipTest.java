import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.lviv.iot.algo.part1.filmApp.Clip;

public class ClipTest {
    private Clip clip;

    @Before
    public void init() {
        clip = new Clip();
    }

    @Test
    public void firstValueTest() {
        clip.setLikes(40);
        clip.setViews(200);
        Assert.assertEquals(0.2, clip.getCurrentRating(), 0.00000001);
    }
}
