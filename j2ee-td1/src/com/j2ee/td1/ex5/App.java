package com.j2ee.td1.ex5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Entrez les ages des personnes souhaitant faire du toboggan : ");
		String line;
		try (Scanner scan = new Scanner(System.in)) {
			while (scan.hasNextLine()) {
				line = scan.nextLine();
				int childrenNumber = 0;
				String[] ages = line.split("\\s+");
				for(int i = 0; i < ages.length; i++) {
					int age = Integer.parseInt(ages[i]);
					if(age >= 5 && age <= 9) {
						childrenNumber++;
					}
				}
				System.out.println("Nombre d'enfants pouvant faire du toboggan : " + childrenNumber);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
