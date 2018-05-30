package ru.dglv.lesson2streams.optional;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface StringOperation {
    static long countLowercaseLetters(String string) {
        return string.chars()
                .filter(Character::isLowerCase)
                .count();
    }

    static Optional<String> mostLowercaseString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparing(StringOperation::countLowercaseLetters));
    }
}
