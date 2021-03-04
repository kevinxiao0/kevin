package com.lambda.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.Predicate;

@Data
@AllArgsConstructor
public class Employee {

    private int id;
    private int age;
    private String gender;
    private String firstName;
    private String lastName;

    public static Predicate<Employee> genderM = x-> x.getGender().equals("m");

    public static Predicate<Employee> ageIsBigThan1 = x-> x.getAge()>1;


}
