package com.j2ee.td2.ex5;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Boulangerie {
	private Collection<Employe> employes = new LinkedHashSet<Employe>();
	
	public void ajouterEmploye(Employe employe) {
		this.employes.add(employe);
	}
	
	public long calculerSalaireMoyen() {
		if(this.employes.size() == 0) {
			return 0;
		}
		long sommeSalaires = 0;
		
		for(Employe employe : this.employes) {
			sommeSalaires += employe.getSalaire();
		}
		return sommeSalaires / this.employes.size();
	}
	
	public long calculerChiffreAffaireTotal() {
		long result = 0;
		
		for(Employe employe : this.employes) {
			result += employe.getChiffreAffaire();			
		}
		
		return result;
	}
}
