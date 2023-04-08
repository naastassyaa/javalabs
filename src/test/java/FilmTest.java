import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.lviv.iot.algo.part1.filmApp.Film;

public class FilmTest {
    private Film film;

    @Before
    public void init() {
        film = new Film();
    }

    @Test
    public void firstValueTest() {
        film.setMarks(5);
        film.setRating(49);
        Assert.assertEquals(9.8, film.getCurrentRating(), 0.00000001);
    }
}
