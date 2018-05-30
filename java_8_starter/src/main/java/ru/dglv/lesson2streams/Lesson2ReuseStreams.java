package ru.dglv.lesson2streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Lesson2ReuseStreams {
    public static void main(String[] args) {
        String[] competences = {"Java", "C++", "JavaScript", "Angular", "React"};

        Supplier<Stream<String>> streamSupplier = () -> Stream.of(competences);

        streamSupplier.get()
                .filter(x -> x.length() < 6)
                .peek(e -> System.out.println("Mapped value: " + e))
                .count();

        streamSupplier.get()
                .sorted()
                .peek(e -> System.out.println("Sorted value: " + e))
                .count();
    }
}
