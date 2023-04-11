import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.filmApp.Cartoon;

public class CartoonTest {
    private Cartoon cartoon;

    @BeforeEach
    public void init() {
        cartoon = new Cartoon();
    }

    @Test
    public void firstValueTest() {
        cartoon.setRating(36);
        cartoon.setMarks(6);
        Assertions.assertEquals(6, cartoon.getCurrentRating(), 0.00000001);
    }
}
