import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.filmApp.TikTok;

public class TikTokTest {
    private TikTok tikTok;
    @BeforeEach
    public void init() {
        tikTok = new TikTok();
    }

    @Test
    public void firstValueTest() {
       tikTok.setComments(23);
       tikTok.setViews(90);
       tikTok.setLikes(22);
        Assertions.assertEquals(0.5, tikTok.getCurrentRating(), 0.00000001);
    }
}
