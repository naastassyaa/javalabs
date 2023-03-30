package ua.lviv.iot.algo.part1.filmApp;

import java.util.ArrayList;
import java.util.Objects;

public class VideoManager {

    private static ArrayList<Video> videos = new ArrayList<>();

    public static void main(String[] args) {
        VideoManager.addVideo(new Film("Титанік", "Джеймс Кемерон", 1997, 56, 12));
        VideoManager.addVideo(new Film("Форсаж", "Роб Коен", 2001, 100, 11));

        VideoManager.addVideo(new Clip("Sad Svit - Силуети Lyrics video", "Sad Novelist", 2022, "Силуети", "Sad Svit", 81000, 3700000));
        VideoManager.addVideo(new Clip("Антитіла - TDME", "Сергій Вусик", 2017, "TDME", "Антитіла", 174000, 27000000));

        VideoManager.addVideo(new Cartoon("Мавка. Лісова пісня", "Олександра Рубан", 2023, "Фентезі", 12, "Земля", 145, 15));
        VideoManager.addVideo(new Cartoon("Зоотрополіс", "Байрон Говард", 2016, "Комедія", 17, "Зоотрополіс", 178, 20));

        VideoManager.addVideo(new TikTok("Cooking", "SashaBo", 2022, "Mockingbird", "Talking", 123, 506, 1098));
        VideoManager.addVideo(new TikTok("My Style", "SashaBo", 2023, "Mockingbird", "Fashion", 129, 409, 8048));

        for (Video video : videos) {
            System.out.println(video);
            System.out.println("Середній рейтинг:" + video.getCurrentRating());
        }

        VideoManager.findAllWithYearMoreThan(2018);
        VideoManager.findAllWithSameDirector("Джеймс Кемерон");
    }

    public static void addVideo(final Video video) {
        videos.add(video);
    }

    public static void findAllWithYearMoreThan(int year) {
        System.out.println("Відео, які випущені пізніше за " + year + ":");
        videos.stream().filter(v -> (v.getYear() > year)).toList().forEach(System.out::println);
    }

    public static void findAllWithSameDirector(String director) {
        System.out.println("Відео, випущені режисером " + director + ":");
        videos.stream().filter(v -> (Objects.equals(v.getDirector(), director))).toList().forEach(System.out::println);
    }
}
