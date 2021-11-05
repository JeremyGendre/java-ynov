package com.j2ee.td2.ex6;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class Ecole {
	List<Etudiant> etudiants;
	List<MembreDuPersonnel> membresDuPersonnel;
	
	List<Cours> cours;
	List<RendezVousIndividuel> rendezVousIndividuels;
	List<JourneeAbsence> journeesAbsence;
	
	public Collection<Utilisateur> extraireUtilisateursARisque(Utilisateur utilisateurPositif, Date dateTestCovid) {
		Collection<Utilisateur> utilisateursARisque = new HashSet<Utilisateur>();
		
		LocalDate dateTest = toLocalDate(dateTestCovid);
		LocalDate dateTestMoins7 = toLocalDate(dateTestCovid).minusDays(7);
		// Corps de la méthode ....
		for (Cours c : cours) {
			LocalDate dateCours = toLocalDate(c.dateCours);
			if (dateCours.isBefore(dateTest) && dateCours.isAfter(dateTestMoins7)) {
				for (Etudiant e : c.etudiantsInscrits) {
					if (c.etudiantsAbsents != null && !c.etudiantsAbsents.contains(e)) {
						utilisateursARisque.add(e);
					}
				}
				utilisateursARisque.add(c.professeur);
			}
		}
		
		return utilisateursARisque;
	}
	
	private static LocalDate toLocalDate(Date date) {
		return LocalDate.ofInstant(date.toInstant(), ZoneId.systemDefault());
	}

}
