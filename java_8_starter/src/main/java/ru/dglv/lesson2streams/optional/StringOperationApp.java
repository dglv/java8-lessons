package ru.dglv.lesson2streams.optional;

import java.util.Arrays;
import java.util.Optional;

public class StringOperationApp {
    public static void main(String[] args) {
        String[] words = {"One", "Two", "Three", "four", "five", "six", "seven"};

        Optional<String> result = Optional.empty();
        //Optional<String> result = StringOperation.mostLowercaseString(Arrays.asList(words));
        //result.ifPresent(x -> System.out.println(x));
        System.out.println(result.orElse("There is no such a string"));
    }
}
