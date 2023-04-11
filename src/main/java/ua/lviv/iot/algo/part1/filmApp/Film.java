package ua.lviv.iot.algo.part1.filmApp;

import lombok.*;

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

    public double getCurrentRating() {
        return (double) rating / marks;
    }
}
