package ru.dglv.lesson2streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson2Map {
    public static void main(String... args) {
        List<String> strings = Stream.of("One", "two", "three", "four").collect(Collectors.toList());
        strings.forEach(System.out::println);

        strings.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        strings.forEach(System.out::println);
    }
}
