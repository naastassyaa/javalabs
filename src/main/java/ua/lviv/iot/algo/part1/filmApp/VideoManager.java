package ua.lviv.iot.algo.part1.filmApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VideoManager {

    private static final ArrayList<Video> VIDEOS = new ArrayList<>();

    public static void addVideo(final Video video) {
        VIDEOS.add(video);
    }

    public static List<Video> findAllWithYearMoreThan(final int year) {
        return VIDEOS.stream()
                    .filter(v -> v.getYear() > year)
                    .toList();
    }
    public static List<Video> findAllWithSameDirector(final String director) {
        return VIDEOS.stream()
                      .filter(v -> Objects.equals(v.getDirector(), director))
                      .toList();
    }
    public final ArrayList<Video> getVideos() {
        return VIDEOS;
    }
}
