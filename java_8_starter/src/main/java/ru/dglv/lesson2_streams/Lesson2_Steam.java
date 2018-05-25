package ru.dglv.lesson2_streams;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Lesson2_Steam {
    public static void main(String... srgs) throws Exception {
        Path path = Paths.get("C:\\DATA\\Projects\\java_8_starter\\src\\main\\resources\\rawdata.txt");
        String content = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
        String[] tokens = content.split("[\\P{L}]+");

/*        List<String> words = Arrays.asList(tokens);
        words.parallelStream().filter(w -> w.length() < 8).forEach(System.out::println);*/

/*        Stream<String> words = Stream.of(tokens);
        words.filter(w -> w.length() < 8).forEach(System.out::println);*/

        Stream<String> words = Pattern.compile("[\\P{L}]+").splitAsStream(content);
        words.filter(w -> w.length() < 8).forEach(System.out::println);
    }

}
