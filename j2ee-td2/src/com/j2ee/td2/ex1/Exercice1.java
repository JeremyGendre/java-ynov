package com.j2ee.td2.ex1;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Exercice1 {
	
	public static void main(String[] args) {
		System.out.println(extraireCaracteres("exercice"));
	}


	public static Collection<Character> extraireCaracteres(String string){
		Collection<Character> list = new LinkedHashSet<Character>();
		for(int i = 0; i < string.length(); i++) {
			list.add(string.charAt(i));
		}
		
		return list;
	}
}
