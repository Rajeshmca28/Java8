package com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Demo {

    public static void main(String[] args) {

        List<Employee> emps = Arrays.asList(
                new Employee(1,"Rajesh", 25),
                new Employee(2,"Sweta", 2),
                new Employee(3,"Kiran", 24),
                new Employee(3,"Aayush", 4),
                new Employee(3,"Rakesh", 32),
                new Employee(3,"Mukesh",21) );

        String name = emps.stream()
                .filter(x -> "jack".equals(x.getName()))
                .map(Employee::getName)        
                .findAny()
                .orElse("");

        System.out.println("name : " + name);

        List<String> collect = emps.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

    }
    
}
