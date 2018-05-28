package ru.dglv.lesson2_streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson2_Map {
    public static void main(String... args){
        List<String> strings = Stream.of("One", "two", "three", "four").collect(Collectors.toList());
        strings.forEach(System.out::println);

        strings.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        strings.forEach(System.out::println);
    }
}
