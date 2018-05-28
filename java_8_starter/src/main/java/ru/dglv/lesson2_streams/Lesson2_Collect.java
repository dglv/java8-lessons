package ru.dglv.lesson2_streams;

import java.util.*;
import java.util.stream.Collectors;


public class Lesson2_Collect {
    public static void main(String[] args){
        String[] competences = {"Java", "CSharp", "JavaScript", "React", "Android", "SQL"};

        List<String> streamAsList = Arrays.stream(competences).collect(Collectors.toList());
        Set<String> steramAsSet = Arrays.stream(competences).collect(Collectors.toSet());

        LinkedList<String> streamAsLinkedList = Arrays.stream(competences)
                .collect(Collectors.toCollection(LinkedList::new));
        HashSet<String> streamAsHashSet = Arrays.stream(competences)
                .collect(Collectors.toCollection(HashSet::new));

        String line = Arrays.stream(competences)
                .collect(Collectors.joining(", "));

        //streamAsHashSet.forEach(System.out::println);
        Optional.of(line).ifPresent(System.out::println);
    }
}
