package com.j2ee.td2.ex4;

public class App {

	public static void main(String[] args) {
		ResultatAnalyse result = analyserString("exercice");
		System.out.println("Charactère le plus fréquent : " + result.recupererCaracterePlusUtilise());
		System.out.println("Liste des charactères triés (occurence) : " + result.recupererCaracteresLesPlusUtilises());
		System.out.println("Liste des charactères triés (alphabétique) : " + result.recupererCaracteresUtilisesTries());
		System.out.println("Combinaison : " + result.recupererCaracteresEtOccurences());
	}
	
	public static ResultatAnalyse analyserString(String string) {
		ResultatAnalyse result = new ResultatAnalyse("exercice");
	
		return result;
	}

}
