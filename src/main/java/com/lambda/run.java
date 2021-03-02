package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class run {

    public static void main(String[] args) {

        List<String> nameStrd = Arrays.asList("Lasdf", "iqwuyer", "askjldhf");
        System.out.println(nameStrd);
        List<String> list = nameStrd.stream()
                .filter(s -> s.startsWith("L"))
                .map(String::toUpperCase)
                .sorted()
                .collect(toList());
        System.out.println(list);


        List<String> list2 = Arrays.asList("ialkjshdf", "ualkjshdf", "yaksjdhf", "takljshdf");
        System.out.println(list2.stream()
                .filter(s -> s.startsWith("y"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList()));


        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.startsWith("y")) {
                System.out.println(s.toUpperCase());
            }
        }


        for (String s : list) {
            if (s.startsWith("y")) {
                System.out.println(s.toUpperCase());
            }
        }

        System.out.println("状态");

        List<String> limitN = Stream.of("ialkjshdf", "ualkjshdf", "yaksjdhf", "takljshdf")
                .parallel()
                .limit(2)
                .collect(toList());
        System.out.println(limitN);

        List<String> skipN = Stream.of("ialkjshdf", "ualkjshdf", "yaksjdhf", "takljshdf")
                .skip(2)
                .collect(toList());
        System.out.println(skipN);

        List<String> uniqueN = Stream.of("ialkjshdf", "ualkjshdf", "yaksjdhf", "takljshdf", "ialkjshdf")
                .distinct()
                .collect(toList());
        System.out.println(uniqueN);

        List<String> alphabeticOrder = Stream.of("aialkjshdf", "ualkjshdf", "byaksjdhf", "takljshdf", "cialkjshdf")
                .sorted()
                .collect(toList());
        System.out.println(alphabeticOrder);





    }
}