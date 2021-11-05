package com.j2ee.td2.ex6;

import java.util.Date;

public class Utilisateur {
	String nom;
	String prenom;
	Date dateDeNaissance;
	String email;
	
	public Utilisateur(String nom, String prenom, Date dateDeNaissance, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.email = email;
	}
}
