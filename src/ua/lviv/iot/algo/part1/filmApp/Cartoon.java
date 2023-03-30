package ua.lviv.iot.algo.part1.filmApp;

import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)

public class Cartoon extends Video {
    private String genre;
    private int numberOfCharacters;
    private String location;
    private int rating;
    private int marks;

    public Cartoon(String titleOfVideo, String director, int year, String genre, int numberOfCharacters, String location, int rating, int marks) {
        super(titleOfVideo, director, year);
        this.rating = rating;
        this.marks = marks;
        this.genre = genre;
        this.numberOfCharacters = numberOfCharacters;
        this.location = location;
    }

    public double getCurrentRating() {
        return (double) rating / marks;
    }
}
