package com.j2ee.td1.ex2;

public class App {

	public static void main(String[] args) {
		System.out.println(isEven(447));
		System.out.println(isEven(876));
		System.out.println(isOdd(234));
		System.out.println(isOdd(3));
	}
	
	public static boolean isEven(long number) {
		return number %2 == 0;
	}
	
	public static boolean isOdd(long number) {
		return !isEven(number);
	}

}
