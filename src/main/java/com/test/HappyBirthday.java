package com.test;

public class HappyBirthday {
	public static void wish(String name) {
		System.out.println("Happy Birthday"+name+"!");
	}
	public static void wish() {
		wish("To You");
	}
	public static void main(String[] args) {
		wish();
		wish("dear Aayush Raj Mahto ");
	}

}
