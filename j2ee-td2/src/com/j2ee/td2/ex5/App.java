package com.j2ee.td2.ex5;

public class App {

	public static void main(String[] args) {
		Boulangerie boulangerie = new Boulangerie();
		boulangerie.ajouterEmploye(new Vendeur("Pierre", 30000));
		boulangerie.ajouterEmploye(new Vendeur("Jean", 22000));
		boulangerie.ajouterEmploye(new Boulanger("Delphine"));
		boulangerie.ajouterEmploye(new Boulanger("Coraline"));
		boulangerie.ajouterEmploye(new Boulanger("Anthony"));
		
		System.out.println("Salaire moyen : " + boulangerie.calculerSalaireMoyen() + "€");
		System.out.println("CA total : " + boulangerie.calculerChiffreAffaireTotal() + "€");
	}

}
