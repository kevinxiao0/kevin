package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class run {

    public static void main(String[] args) {

//        List<String> nameStrd = Arrays.asList("Lasdf","iqwuyer", "askjldhf");
//
//        System.out.println(nameStrd);
//
//        List<String> list = nameStrd.stream()
//                .filter(s -> s.startsWith("L"))
//                .map(String::toUpperCase)
//                .sorted()
//                .collect(toList());
//
//        System.out.println(list);




        List<String> list = Arrays.asList("ialkjshdf","ualkjshdf","yaksjdhf","takljshdf");


//        System.out.println(list.stream()
//                .filter(s -> s.startsWith("y"))
//                .map(String::toUpperCase)
//                .sorted()
//                .collect(Collectors.toList()));

//        for (int i = 0; i <list.size() ; i++) {
//            String s = list.get(i);
//            if(s.startsWith("y"))
//            {
//                System.out.println(s.toUpperCase());
//            }
//        }

        for (String s: list){
            if(s.startsWith("y"))
            {
                System.out.println(s.toUpperCase());
            }
        }

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        double b = scan.nextDouble();

        String c ="";

        c += scan.nextLine();

        System.out.println(a+b+c);















    }
}