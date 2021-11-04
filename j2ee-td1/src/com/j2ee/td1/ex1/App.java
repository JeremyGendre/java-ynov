package com.j2ee.td1.ex1;

public class App {

	public static void main(String[] args) {
		System.out.println(factorial(10));
		System.out.println(factorial(8));
	}
	
	public static long factorial(long number) {
		if (number <= 1) {
			return 1;
		}
		else {
			return number * factorial(number - 1);
		}
	}

}
