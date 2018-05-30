package ru.dglv.lesson2streams.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Album metallica1986 = new Album("Master of Puppets", "Metallica");
        String[] metallicaSongs1986 = {"Battery",
                "Master of Puppets",
                "The Thing That Should Not Be",
                "Welcome Home (Sanitarium)",
                "Disposable Heroes",
                "Leper Messiah",
                "Orion",
                "Damage, Inc."};

        Arrays.stream(metallicaSongs1986).forEach(metallica1986::addTrack);

        Album metallica2016 = new Album("Hardwired...To Self-Destruct", "Metallica");
        String[] metallicaSongs2016 = {"Hardwired",
                "Atlas, Rise!",
                "Now That We're Dead",
                "Moth Into Flame",
                "Dream No More",
                "Halo on Fire",
                "Confusion",
                "ManUNkind",
                "Here Comes Revenge",
                "Am I Savage?",
                "Murder One",
                "Spit Out the Bone"};

        Arrays.stream(metallicaSongs2016).forEach(metallica2016::addTrack);

        List<Album> allMyAlbums = new ArrayList<>();
        allMyAlbums.add(metallica1986);
        allMyAlbums.add(metallica2016);

        List<String> allSongs = allMyAlbums.stream()
                .map(album -> album.getTracks())
                .flatMap(tracks -> tracks.stream())
                .collect(Collectors.toList());

        AtomicInteger runCount = new AtomicInteger(0);
        allSongs.forEach(x -> System.out.println(runCount.incrementAndGet() + ": " + x));

    }
}
