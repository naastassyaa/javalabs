package ua.lviv.iot.algo.part1.filmApp;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class Clip extends Video {
    public static final String HEADERS = "nameOfSong, singer, likes, views";
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

    public final double getCurrentRating() {
        return (double) likes / views;
    }
    public final String getHeaders() {
        return HEADERS + ", " + super.getHeaders();
    }

    public final String toCSV() {
        return nameOfSong + ", " + singer + ", " + likes
                + ", " + views + ", " + super.toCSV();
    }
}
