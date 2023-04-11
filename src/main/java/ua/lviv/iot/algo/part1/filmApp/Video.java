package ua.lviv.iot.algo.part1.filmApp;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor

public abstract class Video {
    protected String titleOfVideo;
    protected String director;
    protected int year;

    public Video(final String mTitleOfVideo,
                 final String mDirector, final int mYear) {
        titleOfVideo = mTitleOfVideo;
        director = mDirector;
        year = mYear;
    }

    abstract double getCurrentRating();
}
