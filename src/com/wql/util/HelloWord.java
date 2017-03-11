package com.wql.util;

public class HelloWord {
	
	public static void sayHello() {
		System.out.println("1111!");
		System.out.println("helle word !");
	}
	
	public static double getCode() {
		return Math.random()*100;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello word!");
		System.out.println(HelloWord.getCode());
		HelloWord.sayHello();
	}
	
}
