package com.test.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpJava8Demo {
	public static void main(String[] args) {
		
		List<Emp>em=Arrays.asList(
				new Emp(1,"rajesh",24,new BigDecimal(20000),"patna"),
				new Emp(2,"Mukesh",23,new BigDecimal(40000),"Delhi"),
				new Emp(5,"Manish",41,new BigDecimal(60000),"Pune"),
				new Emp(6,"samir",31,new BigDecimal(15000),"patna"),
				new Emp(9,"sujit",52,new BigDecimal(200000),"patna"));
		List<String> res=new ArrayList<>();
		for(Emp e:em) {
			res.add(e.getName());
			
			}
			System.out.println(res);
			
		//List<String>res=em.stream().map(x->x.getName()).collect(Collectors.toList());
		//System.out.println(res);
		
		}
	}
		

