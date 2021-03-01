package com.lambda;

import com.lambda.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterPredicate {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, 2, "m", "ric", "bee");
        Employee e2 = new Employee(2, 3, "f", "mar", "her");
        Employee e3 = new Employee(3, 4, "m", "jon", "low");


        List<Employee> employee = Arrays.asList(e1, e2, e3);

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
    }
}
