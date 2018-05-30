package ru.dglv.lesson1simplelambda;

import java.util.Arrays;

public class Lesson1Lambda {

    public static void main(String[] args) {

        String[] words = {"one", "two", "three", "four", "five", "six", "seven"};

        //sorting by length
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));

        Arrays.stream(words).forEach(System.out::println);

    }
}
