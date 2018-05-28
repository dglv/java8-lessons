package ru.dglv.lesson2_streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Lesson2_FlatMap {
    public static void main(String[] args){
        String[][] members = new String[][]{{"Java", "JavaScript", "SQL"},
            {"C++", "NoSQL"},
            {"CSharp", "Angular", "React"},
            {"Android", "JavaScript", "SQL", "NoSQL"}};

        Stream<String[]> temp = Arrays.stream(members);

        Stream<String> competences = temp.flatMap(x -> Stream.of(x));

        competences.distinct().sorted().forEach(System.out::println);
    }
}
