package com.j2ee.td2.ex4;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;

import com.j2ee.td2.ex2.Exercice2;
import com.j2ee.td2.ex3.Exercice3;

public class ResultatAnalyse {
	
	private String string;
	
	public ResultatAnalyse(String string) {
		this.string = string;
	}
	
	public Character recupererCaracterePlusUtilise() {
		return this.recupererCaracteresLesPlusUtilises().iterator().next();
	}
	
	public Collection<Character> recupererCaracteresUtilisesTries() {
		return Exercice2.extraireCaracteres(this.string);
	}
	
	public Collection<Character> recupererCaracteresLesPlusUtilises() {
		Collection<Character> result = new LinkedHashSet<Character>();
		
		Map<Character, Integer> list = MapUtil.sortByValue(Exercice3.extraireCaracteres(this.string),true);
		for(Map.Entry<Character, Integer> entry: list.entrySet()) {
			result.add(entry.getKey());
		}
		
		return result;
	}
	
	public Map<Character, Integer> recupererCaracteresEtOccurences() {
		return Exercice3.extraireCaracteres(this.string);
	}
}
