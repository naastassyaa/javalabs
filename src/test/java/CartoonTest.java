import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.lviv.iot.algo.part1.filmApp.Cartoon;

public class CartoonTest {
    private Cartoon cartoon;

    @Before
    public void init() {
        cartoon = new Cartoon();
    }

    @Test
    public void firstValueTest() {
        cartoon.setRating(36);
        cartoon.setMarks(6);
        Assert.assertEquals(6, cartoon.getCurrentRating(), 0.00000001);
    }
}
