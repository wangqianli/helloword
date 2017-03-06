package com.wql.util;

public class HelloWord {
	
	
	public static double getCode() {
		return Math.random()*100;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello word!");
		System.out.println(HelloWord.getCode());
	}
	
}
