package ua.lviv.iot.algo.part1.filmApp;

import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
public class Clip extends Video {
    private String nameOfSong;
    private String singer;
    private int likes;
    private int views;

    public Clip(String titleOfVideo, String director, int year, String nameOfSong, String singer, int likes, int views) {
        super(titleOfVideo, director, year);
        this.nameOfSong = nameOfSong;
        this.singer = singer;
        this.likes = likes;
        this.views = views;
    }

    public double getCurrentRating() {
        return (double) likes / views;
    }
}
