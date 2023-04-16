package ua.lviv.iot.algo.part1.filmApp;

import java.io.PrintWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public final class VideoWriter {
    private VideoWriter() {
    }
    public static void writeToFile(final List<Video> videos) {
        try {
            PrintWriter myWriter = new PrintWriter("videos.csv",
                    StandardCharsets.UTF_8);
            if (videos.size() > 0) {
                Map<String, List<Video>> videosPerType = videos.stream()
                        .collect(groupingBy(w -> w.getClass().getSimpleName()));
                for (List<Video> video : videosPerType.values()) {
                    myWriter.println(video.get(0).getHeaders());

                    for (Video video1 : video) {
                        myWriter.println(video1.toCSV());
                    }
                    myWriter.println();
                }
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
