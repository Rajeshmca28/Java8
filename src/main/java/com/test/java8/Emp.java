package com.test.java8;

import java.math.BigDecimal;

public class Emp {
	private int id;
	private String name;
	private int age;
	private BigDecimal sal;
	private String addr;

	public Emp(int id,String name,int age,BigDecimal sal,String addr) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.sal=sal;
		this.addr=addr;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getSal() {
		return sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public String getAddr() {
		return addr;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal + ", addr=" + addr + "]";
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
