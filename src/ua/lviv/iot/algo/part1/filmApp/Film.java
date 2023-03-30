package ua.lviv.iot.algo.part1.filmApp;

import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)

public class Film extends Video {
    private int rating;
    private int marks;

    public Film(String titleOfVideo, String director, int year, int rating, int marks) {
        super(titleOfVideo, director, year);
        this.rating = rating;
        this.marks = marks;
    }

    public double getCurrentRating() {
        return (double) rating / marks;
    }
}
