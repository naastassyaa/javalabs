import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.lviv.iot.algo.part1.filmApp.TikTok;

public class TikTokTest {
    private TikTok tikTok;

    @Before
    public void init() {
        tikTok = new TikTok();
    }

    @Test
    public void firstValueTest() {
       tikTok.setComments(23);
       tikTok.setViews(90);
       tikTok.setLikes(22);
        Assert.assertEquals(0.5, tikTok.getCurrentRating(), 0.00000001);
    }
}
