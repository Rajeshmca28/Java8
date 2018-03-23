package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava8 {

    public static void main(String[] args) {

        List<String> alpha = Arrays.asList("Rajesh", "Kumar", "MCA", "28");

        //Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha) {
            alphaUpper.add(s.toLowerCase());
        }

        System.out.println(alpha); 
            System.out.println(alphaUpper);
            
            
        // Java 8
        List<String> res = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(res); 
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> prnt = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(prnt);

    }

}
