package com.j2ee.td2.ex6;

import java.util.Date;

public class RendezVousIndividuel {
	ConseillerOrientation conseiller;
	Etudiant etudiant;
	Date date;
	
	public RendezVousIndividuel(ConseillerOrientation conseiller, Etudiant etudiant, Date date) {
		this.conseiller = conseiller;
		this.etudiant = etudiant;
	}
}
