package ua.lviv.iot.algo.part1.filmApp;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Film {
    private String title;
    private String director;
    private int year;
    private int rating;
    private int marks;
    private static Film defaultFilm = new Film();

    public static Film getInstance() {
        return defaultFilm;
    }

    public void rate(int rating) {
        if (rating < 1) {
            rating = 1;
        } else if (rating > 10) {
            rating = 10;
        }
        this.rating += rating;
        marks++;
    }

    public double getCurrentRating() {
        return (double) rating / marks;
    }

    public static void main(String[] args) {
        Film[] films = new Film[4];

        films[0] = new Film();
        films[1] = new Film("Титанік", "Джеймс Кемерон", 1997, 100, 12);
        films[2] = Film.getInstance();
        films[3] = Film.getInstance();

        films[1].rate(20);
        System.out.println("Середній рейтинг фільму: " + films[1].getCurrentRating());


        int i = 0;
        while (i < films.length) {
            System.out.println(films[i]);
            i++;
        }
    }

}

