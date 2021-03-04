package com.lambda;

import com.lambda.model.Employee;
import com.lambda.StreamFilterPredicate;

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


        // 归约

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int total = numbers.stream().reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(total);

        int total1 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(total1);

        List<String> string = Arrays.asList("a", "b", "c", "d");

        String stringResult = string.stream().reduce("", (subtotal, element) -> subtotal.concat(element));
        System.out.println(stringResult);

        String stringResult1 = string.stream().reduce("", (subtotal, element) -> (subtotal + element));
        System.out.println(stringResult1);

        String stringResult2 = string.stream().reduce("", String::concat);
        System.out.println(stringResult2);

        //Employee

        Employee e1 = new Employee(1, 2, "m", "ric", "bee");
        Employee e2 = new Employee(2, 4, "f", "mar", "her");
        Employee e3 = new Employee(3, 4, "m", "jon", "low");
        Employee e4 = new Employee(3, 5, "h", "son", "yow");

        List<Employee> employees = Arrays.asList(e1,e2,e3,e4);
        int totalAge = employees.stream()
                .map(Employee::getAge)
                .reduce(0, Integer::sum);
        System.out.println(totalAge);

        int totalAge1 = employees.parallelStream()
                .map(Employee::getAge)
                .reduce(0, Integer::sum, Integer::sum);
        System.out.println(totalAge1);

        employees.stream().reduce(0,(subTotal, employee)-> subTotal+ employee.getAge(), Integer::sum);





    }
}