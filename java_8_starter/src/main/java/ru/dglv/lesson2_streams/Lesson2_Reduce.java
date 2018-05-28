package ru.dglv.lesson2_streams;

import java.util.Arrays;
import java.util.OptionalInt;

public class Lesson2_Reduce {
    public static void main(String[] args){
        int[] input = {10, 12, 5, 8, 201, -8, 0, 2};

        OptionalInt result = Arrays.stream(input).reduce((x, y) -> x + y);
        //int intResult = Arrays.stream(input).sum();
        //int intResult = Arrays.stream(input).reduce(0, Integer::sum);

        result.ifPresent(System.out::println);
    }
}
