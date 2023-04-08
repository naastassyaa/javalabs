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

    public Video(String titleOfVideo, String director, int year) {
        this.titleOfVideo = titleOfVideo;
        this.director = director;
        this.year = year;
    }

    abstract double getCurrentRating();
}
