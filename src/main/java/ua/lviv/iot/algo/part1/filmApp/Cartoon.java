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
    public static final String HEADERS = "genre, location, rating, marks";
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
    public final String getHeaders() {
        return HEADERS + ", " + super.getHeaders();
    }

    public final String toCSV() {
        return genre + ", " + location + ", " + rating
                + ", " + marks + ", " + super.toCSV();
    }
}
