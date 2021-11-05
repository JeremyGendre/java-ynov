package com.j2ee.td2.ex6;

import java.util.Date;
import java.util.List;

public class Cours {
	List<Etudiant> etudiantsInscrits;
	List<Etudiant> etudiantsAbsents;
	Professeur professeur;
	
	Date dateCours;

	public Cours(List<Etudiant> etudiantsInscrits, List<Etudiant> etudiantsAbsents, Professeur professeur, Date dateCours) {
		this.etudiantsInscrits = etudiantsInscrits;
		this.etudiantsAbsents = etudiantsAbsents;
		this.professeur = professeur;
		this.dateCours = dateCours;
	}
}
