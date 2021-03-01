package com.lambda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {


    public static void main(String[] args) {

        List<String> lists = Arrays.asList("alskdjfh", "asdkjf");
        List<String> list = lists
                .stream()
                .filter(s -> s.contains("a"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);



        String[] stringList = {"skdjlhfg", "lksjdfhg"};
        System.out.println(
                Stream.of(stringList)
                        .filter(s -> s.contains("s"))
                        .map(String::toUpperCase)
                        .collect(Collectors.toList()));
        Stream.of(stringList)
                .mapToInt(String::length)
                .forEach(System.out::println);


        Set<String> setString = new HashSet<>(lists);
        System.out.println(
                setString.stream()
                        .filter(s -> s.contains("a"))
                        .map(String::toUpperCase)
                        .collect(Collectors.toList()));


    }
    
}
