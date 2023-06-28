import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.filmApp.*;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;

public class VideoWriterTest {
    ArrayList<Video> videoList = new ArrayList<>();

    @BeforeEach
    public void init() {
        videoList.add(new Clip("Sad Svit - Силуети Lyrics video", "Sad Novelist", 2022, "Силуети", "Sad Svit", 81000, 3700000));
        videoList.add(new Film("Титанік", "Джеймс Кемерон", 1997, 56, 12));
        videoList.add(new Cartoon("Мавка. Лісова пісня", "Олександра Рубан", 2023, "Фентезі", "Земля", 145, 15));
        videoList.add(new Clip("Sad Svit - Силуети Lyrics video", "Sad Novelist", 2022, "Силуети", "Sad Svit", 81000, 3700000));
        videoList.add(new Film("Форсаж", "Роб Коен", 2001, 100, 11));
    }

    @Test
    public void testWriteToFile() throws IOException {
        VideoWriter.writeToFile(videoList);
        File expectedFile = new File("D:\\Java\\lab4.12\\videosExpected.csv");
        File actualFile = new File("D:\\Java\\lab4.12\\videos.csv");
        Assertions.assertTrue(Files.exists(actualFile.toPath()));
        Assertions.assertEquals(Files.readAllLines(expectedFile.toPath()), Files.readAllLines(actualFile.toPath()));
    }

    @Test
    public void testWriteToFileExist() throws IOException {
        PrintWriter myWriter = new PrintWriter("videos.csv", StandardCharsets.UTF_8);
        myWriter.println("ttfdsghfk");
        myWriter.close();

        VideoWriter.writeToFile(videoList);
        File expectedFile = new File("D:\\Java\\lab4.12\\videosExpected.csv");
        File actualFile = new File("D:\\Java\\lab4.12\\videos.csv");

        Assertions.assertTrue(Files.exists(actualFile.toPath()));
        Assertions.assertEquals(Files.readAllLines(expectedFile.toPath()), Files.readAllLines(actualFile.toPath()));
    }

    @Test
    public void testWriteToFileEmpty() {
        VideoWriter.writeToFile(new ArrayList<>());
        File actualFile = new File("D:\\Java\\lab4.12\\videos.csv");
        Assertions.assertTrue(Files.exists(actualFile.toPath()));
        Assertions.assertEquals(0, actualFile.length());
    }
}
