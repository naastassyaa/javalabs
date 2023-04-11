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
}
