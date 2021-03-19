package com.lambda;

import com.lambda.model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamFilterPredicate {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, 2, "m", "ric", "bee");
        Employee e2 = new Employee(2, 4, "f", "mar", "her");
        Employee e3 = new Employee(3, 4, "m", "jon", "low");
        Employee e4 = new Employee(3, 5, "h", "son", "yow");

        List<Employee> employee = Arrays.asList(e1, e2, e3, e4);

        List<Employee> employeeList = employee.stream()
                .filter(e -> e.getAge() > 2 && e.getId() > 2)
                .collect(Collectors.toList());
        System.out.println(employeeList);

        List<Employee> employeeListMale = employee.stream()
                .filter(Employee.genderM)
                .collect(Collectors.toList());
        System.out.println(employeeListMale);


        List<Employee> mapedList = employee.stream()
                .map(e -> {
                    e.setAge(e.getAge() + 1);
                    e.setGender(e.getGender().equals("m") ? "male" : "female");
                    return e;
                })
                .collect(Collectors.toList());

        System.out.println(mapedList);


        //排序

        employee.forEach(System.out::println);

        System.out.println("---");
        employee.sort(
                Comparator
                        .comparing(Employee::getId)
                        .reversed()
                        .thenComparing(Employee::getAge)
        );

        employee.forEach(System.out::println);

        //查询年龄

        boolean ageIsBigThan4 = false;
        for (Employee e : employee) {
            if (e.getAge() > 4) {
                ageIsBigThan4 = true;
                break;
            }
        }
        System.out.println(ageIsBigThan4);

        boolean idIsBigThan4 = employee.stream().anyMatch(employee1 -> employee1.getId() > 2);
        System.out.println(idIsBigThan4);

        boolean idAgeBigThan1 = employee.stream().anyMatch(Employee.ageIsBigThan1);
        System.out.println(idAgeBigThan1);

        boolean allAgeBigThan5 = employee.stream().allMatch(e -> e.getAge() > 5);
        System.out.println(allAgeBigThan5);

        boolean isExistAnyBigThan5 = employee.stream().noneMatch(e -> e.getAge() > 6);
        System.out.println(isExistAnyBigThan5);

        //optional

        Optional<Employee> optionalEmployee = employee.stream().filter(e -> e.getAge() > 2).findFirst();
        System.out.println(optionalEmployee.get());

        boolean isAgeBigThan2 = employee.stream().filter(e -> e.getAge() > 2)
                .findFirst()
                .isPresent();
        System.out.println(isAgeBigThan2);

        employee.stream().filter(e -> e.getAge() > 6)
                .findFirst()
                .ifPresent(s -> {
                    s.setId(99);
                    System.out.println(s);
                });

        System.out.println(
                employee.stream().filter(e -> e.getAge() > 6)
                        .findFirst()
                        .orElse(new Employee(99, 88, "m", "xxx", "ccc"))
        );

        System.out.println(
                employee.stream().filter(e -> e.getAge() >0 )
                        .findAny()
                        .orElse(new Employee(99, 88, "m", "xxx", "ccc"))
        );



    }
}
