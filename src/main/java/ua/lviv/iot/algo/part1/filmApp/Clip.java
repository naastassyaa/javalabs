package ua.lviv.iot.algo.part1.filmApp;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class Clip extends Video {
    private String nameOfSong;
    private String singer;
    private int likes;
    private int views;

    public Clip(final String titleOfVideo, final String director,
                final int year, final String mNameOfSong, final String mSinger,
                final int mLikes, final int mViews) {
        super(titleOfVideo, director, year);
        nameOfSong = mNameOfSong;
        singer = mSinger;
        likes = mLikes;
        views = mViews;
    }

    public double getCurrentRating() {
        return (double) likes / views;
    }
}
