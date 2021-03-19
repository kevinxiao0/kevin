package com.lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {


    public static void main(String[] args) {

        List<String> lists = Arrays.asList("alskdjfh", "asdkjf","iuweytrwgef","eskjhdfgjk", "LKJHKJLHKJL");


        List<String> list = lists
                .stream()
                .filter(s -> s.contains("a"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);

        lists.stream().filter(s -> s.contains("a")).map(s -> s.toUpperCase()).sorted().collect(Collectors.toList());



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


        //排序
        System.out.println(lists);

        lists.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(lists);

        lists.sort(Comparator.naturalOrder());
        System.out.println(lists);



    }
    
}
