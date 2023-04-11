import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.filmApp.Clip;

public class ClipTest {
    private Clip clip;

    @BeforeEach
    public void init() {
        clip = new Clip();
    }

    @Test
    public void firstValueTest() {
        clip.setLikes(40);
        clip.setViews(200);
        Assertions.assertEquals(0.2, clip.getCurrentRating(), 0.00000001);
    }
}
