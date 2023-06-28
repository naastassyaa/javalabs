package ua.lviv.iot.algo.part1.filmApp;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class TikTok extends Video {
    public static final String HEADERS = "nameOfSong, likes, views, comments";
    private String nameOfSong;
    private int likes;
    private int views;
    private int comments;

    public TikTok(final String titleOfVideo, final String director,
                  final int year, final String mNameOfSong,
                  final int mComments,
                  final int mLikes, final int mViews) {
        super(titleOfVideo, director, year);
        nameOfSong = mNameOfSong;
        comments = mComments;
        likes = mLikes;
        views = mViews;
    }

    public final double getCurrentRating() {
        return (double) (likes + comments) / views;
    }

    public final String getHeaders() {
        return HEADERS + "," + super.getHeaders();
    }
    public final String toCSV() {
        return nameOfSong + ", " + likes + ", " + views
                + ", " + ", " + comments + ", " + super.toCSV();
    }
}
