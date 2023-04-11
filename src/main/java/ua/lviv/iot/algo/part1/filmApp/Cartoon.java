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
    private String location;
    private int rating;
    private int marks;

    public Cartoon(final String titleOfVideo, final String director,
                   final int year, final String mGenre,
                   final String mLocation,
                   final int mRating, final int mMarks) {
        super(titleOfVideo, director, year);
        rating = mRating;
        marks = mMarks;
        genre = mGenre;
        location = mLocation;
    }
    public final double getCurrentRating() {
        return (double) rating / marks;
    }
}
