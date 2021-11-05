package com.j2ee.td2.ex5;

public abstract class Employe {
	protected String nom;
	
	protected long salaire;
	
	protected long chiffreAffaire = 0;
	
	public Employe(String nom) {
		this.nom = nom;
	}
	
	public long getSalaire() {
		return this.salaire;
	}
	
	public long getChiffreAffaire() {
		return this.chiffreAffaire;
	}
}
