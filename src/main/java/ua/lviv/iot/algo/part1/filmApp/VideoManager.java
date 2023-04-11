package ua.lviv.iot.algo.part1.filmApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VideoManager {

    private static final ArrayList<Video> videos = new ArrayList<>();

    public static void addVideo(final Video video) {
        videos.add(video);
    }

    public static List<Video> findAllWithYearMoreThan(final int year) {
        System.out.println("Відео, які випущені пізніше за " + year + ":");
        List<Video> result =
                videos.stream().filter(v -> v.getYear() > year).toList();
        result.forEach(System.out::println);
        return result;
    }

    public static List<Video> findAllWithSameDirector(final String director) {
        System.out.println("Відео, випущені режисером " + director + ":");
        List<Video> result =
                videos.stream().filter(v -> Objects.equals(v.getDirector(), director)).toList();
        result.forEach(System.out::println);
        return result;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

}
