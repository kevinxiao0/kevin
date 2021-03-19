package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {

//    interface Printer{
//        void printer(String val);
//    }
//
//    public void printSomething(String something, Printer printer){
//        printer.printer(something);
//    }
//
//    public static void main(String[] args){
//        LambdaDemo lambdaDemo = new LambdaDemo();
//        String some = "asdf";
//
//        Printer printer = new Printer() {
//            @Override
//            public void printer(String val) {
//                System.out.println(val);
//            }
//        };
//
//        lambdaDemo.printSomething(some,printer);
//    }

    interface Printer {
        void printer(String val);
    }

    public void printerSomething(String something, Printer printer) {
        printer.printer(something);
    }

    public static void main(String[] arge) {

//        LambdaDemo lambdaDemo = new LambdaDemo();
        LambdaDemo lambdaDemo = new LambdaDemo();
        String some = "lasdf";

//        Printer printer = new Printer() {
//            @Override
//            public void printer(String val) {
//                System.out.println(val);
//            }
//        };

//        简化1
//        Printer printer = (String val)-> {System.out.println(val);};

//        简化2
//        Printer printer1 = val ->System.out.println(val);

//        省略
//        lambdaDemo.printerSomething(some, printer);

//        lambdaDemo.printerSomething(some, val -> System.out.println(val));
        lambdaDemo.printerSomething(some, s-> System.out.println(s));


        List<String> words = Arrays.asList("hello", "word");

        words.stream()
                .map(w -> Arrays.stream(w.split("")))
                .forEach(System.out::println);

        words.stream()
                .map(w -> w.split(""))
                .forEach(System.out::println);

        words.stream()
                .map(w -> w.split(""))
                .forEach(System.out::println);

        System.out.println(
                words.stream()
                        .flatMap(w -> Arrays.stream(w.split("")))
//                .forEach(System.out::println);
                        .collect(Collectors.toList())

        );

    }




}