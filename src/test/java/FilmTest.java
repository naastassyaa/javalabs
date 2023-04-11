import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.filmApp.Film;

public class FilmTest {
    private Film film;

    @BeforeEach
    public void init() {
        film = new Film();
    }

    @Test
    public void firstValueTest() {
        film.setMarks(5);
        film.setRating(49);
        Assertions.assertEquals(9.8, film.getCurrentRating(), 0.00000001);
    }
}
