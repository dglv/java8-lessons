package ru.dglv.lesson1simplelambda;

import javax.swing.*;
import java.util.function.Function;

public class Lesson1StandaloneLambda {

    public static void main(String[] args) {

        Function<Integer, Integer> square = x -> x * x;

        System.out.println(square.apply(5));
        System.out.println(square.apply(10));

        /*JButton button = new JButton();
        button.addActionListener(event -> System.out.println(event.getActionCommand()));*/
    }
}
