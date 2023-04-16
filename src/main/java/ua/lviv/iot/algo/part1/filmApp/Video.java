package ua.lviv.iot.algo.part1.filmApp;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor

public abstract class Video {
    public static final String HEADERS = "titleOfVideo, director, year";
    private String titleOfVideo;
    private String director;
    private int year;

    public Video(final String mTitleOfVideo,
                 final String mDirector, final int mYear) {
        titleOfVideo = mTitleOfVideo;
        director = mDirector;
        year = mYear;
    }

    abstract double getCurrentRating();

    public String getHeaders() {
        return HEADERS;
    }

    public String toCSV() {
        return titleOfVideo + ", " + director + ", " + year;
    }
}
