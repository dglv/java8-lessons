package ru.dglv.lesson2streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Lesson2Optional {
    public static void main(String... args) {
        String[] words = {"One", "Two", "Three", "Four", "Five", "Three"};
        Arrays.stream(words).forEach(System.out::println);

        Optional<String> maxvalue = Arrays.stream(words).max(Comparator.comparing(String::length));

        maxvalue.ifPresent(System.out::println);
    }
}
