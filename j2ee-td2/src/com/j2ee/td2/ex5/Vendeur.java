package com.j2ee.td2.ex5;

public class Vendeur extends Employe {

	public Vendeur(String nom, long chiffre) {
		super(nom);
		this.chiffreAffaire = chiffre;
		this.salaire = 1300 + ( chiffre * 10 /100 );
	}
}
