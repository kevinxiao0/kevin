package com.lambda;

import com.lambda.model.Employee;
import com.lambda.StreamFilterPredicate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class run {

    int a =1;
    static int b = 2;

    public void run(){

    }

    public static void go(){

    }


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

//        Scanner scanner = new Scanner(System.in);
//        scanner.hasNextInt();

        String s1 = "abc";
        System.out.println(15-s1.length());
        for(int y=0; y<(15-s1.length()); y++){
            s1=s1+" ";
        }
        System.out.println(s1+123);

        Integer x = 12;


        run r = new run();
        r.a=1;



        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1x="java";
            int xx=100;
            //Complete this line

            String nx = "";
            int ix = s1x.length();
            int ixy = 15-ix;
            if(xx>=100){
                for(int y=0; y<(ixy); y++){
                    s1x=s1x+" ";
                }
                nx = String.valueOf(x);
            }else{
                for(int y=0; y<(ixy); y++){
                    s1x=s1x+" ";
                }
                nx = "0"+String.valueOf(x);
            }


            System.out.println(s1x+nx);

        }
        System.out.println("================================");



        if(x>=-128 && x<=127)System.out.println("* byte");
        //Complete the code
        if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
            System.out.println("* short");
        if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
            System.out.println("* int");
        if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
            System.out.println("* long");

        int n=923874659;
        int c =0;
        String s ="";
        int max=0;
        int count =0;

        while (n>0){
//            c=n%2;
//            if(c==0){
//                s="0"+s;
//            }else{
//                s="1"+s;
//            }
            if(n%2==1){
                count++;
                if(count>max){
                    max=count;
                }
            }else {
                count=0;
            }

          s= (n%2==0 ?"0":"1" )+s;
          n/=2;
        }
        System.out.println(s);
        System.out.println(max);


        int max1=0;
        String[] strparts = s.split("0");
        for (int i = 0; i <strparts.length ; i++) {
//            System.out.println(strparts[i]);
            if( strparts[i].length()>=max1){
                max1=strparts[i].length();
            }
        }
        System.out.println("***");
        System.out.println(max1);





























    }
}