package ua.lviv.iot.algo.part1.filmApp;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)

public class Cartoon extends Video {
    private String genre;
    private int numberOfCharacters;
    private String location;
    private int rating;
    private int marks;

    public Cartoon(final String titleOfVideo, final String director,
                   final int year, final String mGenre,
                   final int mNumberOfCharacters, final String mLocation,
                   final int mRating, final int mMarks) {
        super(titleOfVideo, director, year);
        rating = mRating;
        marks = mMarks;
        genre = mGenre;
        numberOfCharacters = mNumberOfCharacters;
        location = mLocation;
    }
    public double getCurrentRating() {
        return (double) rating / marks;
    }
}
