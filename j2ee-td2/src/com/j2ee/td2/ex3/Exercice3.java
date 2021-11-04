package com.j2ee.td2.ex3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercice3 {
	
	public static void main(String[] args) {
		System.out.println(extraireCaracteres("exercice"));
	}

	public static Map<Character, Integer> extraireCaracteres(String string){
		Map<Character, Integer> list = new LinkedHashMap<Character, Integer>();
		for(int i = 0; i < string.length(); i++) {
			char character = string.charAt(i);
			list.put(character, (int)string.chars().filter(ch -> ch == character).count());			
		}
		
		return list;
	}
}
