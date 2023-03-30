package ua.lviv.iot.algo.part1.filmApp;

import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
public class TikTok extends Video {
    private String nameOfSong;
    private String typeOfTikTok;
    private int likes;
    private int views;
    private int comments;

    public TikTok(String titleOfVideo, String director, int year, String nameOfSong, String typeOfTikTok, int comments, int likes, int views) {
        super(titleOfVideo, director, year);
        this.nameOfSong = nameOfSong;
        this.comments = comments;
        this.likes = likes;
        this.views = views;
        this.typeOfTikTok = typeOfTikTok;
    }

    public double getCurrentRating() {
        return (double) (likes + comments) / views;
    }
}
