package ua.lviv.iot.algo.part1.filmApp;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)

public class Film extends Video {
    private int rating;
    private int marks;

    public Film(final String titleOfVideo,
                final String director, final int year,
                final int mRating, final int mMarks) {
        super(titleOfVideo, director, year);
        rating = mRating;
        marks = mMarks;
    }

    public final double getCurrentRating() {
        return (double) rating / marks;
    }
}
