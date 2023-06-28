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
    public static final String HEADERS = "rating, marks";
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

    public final String getHeaders() {
        return HEADERS + ", " + super.getHeaders();
    }

    public final String toCSV() {
        return rating + ", " + marks + ", " + super.toCSV();
    }
}
