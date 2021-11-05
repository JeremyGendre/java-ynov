package com.j2ee.td2.ex6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Exercice6 {
	
	private static DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {
		Ecole ecole = new Ecole();
		
		// Initialisation des données
		Etudiant e1 = new Etudiant("Jelani", "Dixon", parse("10/22/1998"), "nec.ligula@aauctornon.net");
		Etudiant e2 = new Etudiant("Felicia", "Doyle", parse("05/15/1998"), "rutrum@feliseget.co.uk");
		Etudiant e3 = new Etudiant("Carson", "Weaver", parse("11/04/1996"), "mollis@odioauctor.net");
		Etudiant e4 = new Etudiant("Hoyt", "Welch", parse("08/09/1999"), "vulputate.lacus.Cras@lobortistellus.edu");
		Etudiant e5 = new Etudiant("Amber", "Patterson", parse("05/28/1997"), "Nulla.facilisis.Suspendisse@sit.org");
		Etudiant e6 = new Etudiant("Yolanda", "Miles", parse("02/28/1995"), "vulputate@scelerisque.edu");
		Etudiant e7 = new Etudiant("Kai", "Hunter", parse("02/05/1997"), "erat.nonummy@turpisAliquamadipiscing.com");
		Etudiant e8 = new Etudiant("Carissa", "Wiggins", parse("08/16/1997"), "sed@bibendumDonecfelis.edu");
		Etudiant e9 = new Etudiant("Micah", "Pope", parse("05/22/1998"), "sem@enimgravida.net");
		Etudiant e10 = new Etudiant("Armando", "Andrews", parse("05/19/1999"), "Sed@vitae.ca");
		Etudiant e11 = new Etudiant("Ingrid", "Lester", parse("12/04/1997"), "tellus@quis.net");
		Etudiant e12 = new Etudiant("Beatrice", "Malone", parse("11/30/1998"), "pede@Craseget.net");
		Etudiant e13 = new Etudiant("Cameran", "Summers", parse("03/29/1999"), "Ut.semper.pretium@justoeuarcu.org");
		Etudiant e14 = new Etudiant("Zachary", "Coffey", parse("09/15/1998"), "vel.sapien@Fuscediam.net");
		Etudiant e15 = new Etudiant("William", "Hubbard", parse("02/23/1999"), "odio.vel.est@aliquet.net");
		Etudiant e16 = new Etudiant("Larissa", "Douglas", parse("11/24/1996"), "luctus.et@sagittis.co.uk");
		Etudiant e17 = new Etudiant("Abra", "Burch", parse("01/22/1997"), "cubilia.Curae@interdumCurabiturdictum.com");
		Etudiant e18 = new Etudiant("Damian", "Nicholson", parse("09/02/1996"), "mollis@magnaCras.com");
		Etudiant e19 = new Etudiant("Damian", "Tucker", parse("09/24/1998"), "cursus.vestibulum.Mauris@liberoettristique.org");
		Etudiant e20 = new Etudiant("Cailin", "Holloway", parse("07/26/1999"), "Cum@loremut.co.uk");
		Etudiant e21 = new Etudiant("Ezekiel", "Nunez", parse("03/01/1998"), "quam.elementum.at@nec.co.uk");
		Etudiant e22 = new Etudiant("Alan", "Flowers", parse("12/18/1998"), "Aliquam.nec@telluseuaugue.co.uk");
		Etudiant e23 = new Etudiant("Hayes", "Farrell", parse("09/26/1996"), "a.scelerisque.sed@velitQuisquevarius.ca");
		Etudiant e24 = new Etudiant("Ira", "Best", parse("03/27/1998"), "magna.Ut.tincidunt@luctusipsum.co.uk");
		Etudiant e25 = new Etudiant("Lani", "Ayala", parse("04/22/1999"), "eget.magna@blandit.ca");
		Etudiant e26 = new Etudiant("Indira", "Wilkerson", parse("10/21/1997"), "ut@libero.com");
		Etudiant e27 = new Etudiant("Summer", "Walton", parse("01/24/1995"), "a.nunc@temporarcuVestibulum.ca");
		Etudiant e28 = new Etudiant("Dean", "Kramer", parse("04/02/1998"), "dui.Cum@urnaconvallis.co.uk");
		Etudiant e29 = new Etudiant("Lewis", "Gonzales", parse("03/21/1999"), "mi@euodio.ca");
		Etudiant e30 = new Etudiant("Yael", "Slater", parse("03/09/1997"), "mollis.Phasellus@pellentesquetellus.net");
		Etudiant e31 = new Etudiant("Kirestin", "Powers", parse("04/01/1995"), "consequat@nullaanteiaculis.org");
		Etudiant e32 = new Etudiant("Xavier", "Trevino", parse("02/12/1997"), "faucibus.orci.luctus@orcilobortisaugue.org");
		Etudiant e33 = new Etudiant("Tana", "Diaz", parse("07/18/1995"), "quis@Proinvel.com");
		Etudiant e34 = new Etudiant("Baker", "Brennan", parse("01/16/1997"), "Suspendisse.commodo.tincidunt@uteros.ca");
		Etudiant e35 = new Etudiant("Acton", "Vaughan", parse("03/22/1997"), "consequat@cursus.edu");
		Etudiant e36 = new Etudiant("Francis", "Meyers", parse("06/04/1999"), "sodales@malesuadaaugue.ca");
		Etudiant e37 = new Etudiant("Samuel", "Gill", parse("05/12/1995"), "fermentum@ut.com");
		Etudiant e38 = new Etudiant("Ria", "Curry", parse("01/26/1995"), "turpis@suscipitnonummyFusce.co.uk");
		Etudiant e39 = new Etudiant("John", "Dillon", parse("11/08/1998"), "sollicitudin.adipiscing.ligula@placeratCras.edu");
		Etudiant e40 = new Etudiant("Hyatt", "Jordan", parse("03/21/1996"), "aliquet.magna@egetipsumSuspendisse.edu");
		Etudiant e41 = new Etudiant("Preston", "Foley", parse("01/01/2000"), "Morbi@semperegestasurna.edu");
		Etudiant e42 = new Etudiant("Harlan", "Gallagher", parse("08/24/1997"), "tellus.Nunc.lectus@lacus.co.uk");
		Etudiant e43 = new Etudiant("Adrienne", "Pollard", parse("04/22/1996"), "magna.Sed.eu@Duismienim.edu");
		Etudiant e44 = new Etudiant("Sylvester", "Daniel", parse("08/14/1995"), "Nunc.lectus.pede@lorem.com");
		Etudiant e45 = new Etudiant("Ayanna", "Hopkins", parse("01/31/1999"), "Nunc.mauris@nonleo.ca");
		Etudiant e46 = new Etudiant("Gareth", "Glass", parse("01/12/1995"), "in@euultricessit.co.uk");
		Etudiant e47 = new Etudiant("Wanda", "Perez", parse("01/25/1997"), "Donec@torquentperconubia.com");
		Etudiant e48 = new Etudiant("Diana", "Mckenzie", parse("04/24/1998"), "at@Namconsequat.edu");
		Etudiant e49 = new Etudiant("Rogan", "Barnes", parse("05/19/1998"), "tempus@ornare.org");
		
		MembreEquipeDirection d1 = new MembreEquipeDirection("Cody", "Alexander", parse("12/10/1980"), "Quisque.porttitor.eros@sagittissemper.org");
		MembreEquipeDirection d2 = new MembreEquipeDirection("Urielle", "Fleming", parse("03/20/1974"), "non@faucibusleo.co.uk");
		MembreEquipeDirection d3 = new MembreEquipeDirection("Virginia", "Gamble", parse("08/09/1987"), "vitae.nibh.Donec@mollisnoncursus.net");
		MembreEquipeDirection d4 = new MembreEquipeDirection("Sean", "Butler", parse("05/31/1980"), "tellus.justo@dolor.org");
		MembreEquipeDirection d5 = new MembreEquipeDirection("Kimberly", "Becker", parse("07/30/1979"), "non.dapibus@enimSuspendissealiquet.ca");
		
		ConseillerOrientation o1 = new ConseillerOrientation("Melissa", "Witt", parse("06/23/1978"), "Donec@ultricessit.net");
		ConseillerOrientation o2 = new ConseillerOrientation("Marny", "Padilla", parse("10/13/1987"), "mollis.dui@nequepellentesquemassa.ca");
		
		Professeur p1 = new Professeur("Noah", "Trujillo", parse("01/17/1962"), "massa.lobortis@orci.com");
		Professeur p2 = new Professeur("Deborah", "Harmon", parse("02/11/1964"), "at.nisi.Cum@ridiculusmus.ca");
		Professeur p3 = new Professeur("Seth", "Lee", parse("01/24/1982"), "Etiam.ligula.tortor@mollisDuissit.edu");
		Professeur p4 = new Professeur("Hannah", "Nash", parse("11/28/1970"), "enim@Nuncsed.ca");
		Professeur p5 = new Professeur("Derek", "Randolph", parse("04/09/1988"), "magna.Duis@sempercursusInteger.ca");
		
		ecole.etudiants = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18,
				e19, e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30, e31, e32, e33, e34, e35, e36, e37, e38, e39,
				e40, e41, e42, e43, e44, e45, e46, e47, e48, e49);
		
		ecole.membresDuPersonnel = Arrays.asList(p1, p2, p3, p4, p5, o1, o2, d1, d2, d3, d4, d5);
		
		List<Etudiant> ec1 = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
		List<Etudiant> ec2 = Arrays.asList(e11, e12, e13, e14, e15, e16, e17, e18, e19, e20);
		List<Etudiant> ec3 = Arrays.asList(e21, e22, e23, e24, e25, e26, e27, e28, e29, e30);
		List<Etudiant> ec4 = Arrays.asList(e31, e32, e33, e34, e35, e36, e37, e38, e39, e40);
		List<Etudiant> ec5 = Arrays.asList(e41, e42, e43, e44, e45, e46, e47, e48, e49);
		
		ecole.cours = Arrays.asList(
			new Cours(ec1, Arrays.asList(e3, e4), p1, parse("03/04/2020")),
			new Cours(ec1, null, p1, parse("05/04/2020")),
			new Cours(ec1, Arrays.asList(e1), p1, parse("10/04/2020")),
			new Cours(ec1, Arrays.asList(e9), p1, parse("15/04/2020")),
			new Cours(ec1, null, p1, parse("19/04/2020")),
			new Cours(ec1, null, p1, parse("25/04/2020")),
			new Cours(ec1, Arrays.asList(e9), p1, parse("05/05/2020")),

			new Cours(ec2, Arrays.asList(e20), p2, parse("03/04/2020")),
			new Cours(ec2, null, p2, parse("10/04/2020")),
			new Cours(ec2, null, p2, parse("17/04/2020")),
			new Cours(ec2, null, p2, parse("24/04/2020")),
			new Cours(ec2, Arrays.asList(e16), p2, parse("05/05/2020")),
			new Cours(ec2, null, p2, parse("06/05/2020")),
			new Cours(ec2, Arrays.asList(e13, e14), p2, parse("21/05/2020")),
			new Cours(ec2, null, p2, parse("01/06/2020")),

			new Cours(ec3, Arrays.asList(e21), p3, parse("03/04/2020")),
			new Cours(ec3, null, p3, parse("12/04/2020")),
			new Cours(ec3, null, p3, parse("25/04/2020")),
			new Cours(ec3, null, p3, parse("05/05/2020")),
			new Cours(ec3, null, p3, parse("15/05/2020")),
			new Cours(ec3, Arrays.asList(e23, e24, e25), p3, parse("30/05/2020")),
			new Cours(ec3, null, p3, parse("06/06/2020")),
			new Cours(ec3, null, p3, parse("20/06/2020")),
			
			new Cours(ec4, Arrays.asList(e32), p4, parse("03/04/2020")),
			new Cours(ec4, Arrays.asList(e32), p4, parse("13/04/2020")),
			new Cours(ec4, Arrays.asList(e32), p4, parse("17/04/2020")),
			new Cours(ec4, null, p4, parse("20/04/2020")),
			new Cours(ec4, null, p4, parse("17/05/2020")),
			new Cours(ec4, null, p4, parse("18/05/2020")),
			new Cours(ec4, null, p4, parse("26/05/2020")),
			
			new Cours(ec5, null, p5, parse("03/04/2020")),
			new Cours(ec5, Arrays.asList(e41), p5, parse("04/04/2020")),
			new Cours(ec5, Arrays.asList(e43), p5, parse("05/04/2020")),
			new Cours(ec5, null, p5, parse("10/05/2020")),
			new Cours(ec5, Arrays.asList(e41, e43, e45), p5, parse("12/05/2020")),
			new Cours(ec5, null, p5, parse("13/05/2020"))
		);
		
		ecole.rendezVousIndividuels = Arrays.asList(
			new RendezVousIndividuel(o1, e7, parse("17/05/2020")),
			new RendezVousIndividuel(o1, e13, parse("17/05/2020")),
			new RendezVousIndividuel(o1, e27, parse("17/05/2020")),
			new RendezVousIndividuel(o1, e31, parse("17/05/2020")),
			new RendezVousIndividuel(o1, e42, parse("17/05/2020")),
			new RendezVousIndividuel(o1, e42, parse("25/05/2020")),
			new RendezVousIndividuel(o1, e6, parse("25/05/2020")),
			new RendezVousIndividuel(o1, e22, parse("25/05/2020")),
			new RendezVousIndividuel(o1, e23, parse("25/05/2020")),
			new RendezVousIndividuel(o1, e24, parse("25/05/2020")),
			new RendezVousIndividuel(o1, e25, parse("25/05/2020")),

			new RendezVousIndividuel(o2, e9, parse("17/05/2020")),
			new RendezVousIndividuel(o2, e12, parse("17/05/2020")),
			new RendezVousIndividuel(o2, e24, parse("17/05/2020")),
			new RendezVousIndividuel(o2, e41, parse("17/05/2020")),
			new RendezVousIndividuel(o2, e22, parse("17/05/2020")),
			new RendezVousIndividuel(o2, e12, parse("25/05/2020")),
			new RendezVousIndividuel(o2, e5, parse("25/05/2020")),
			new RendezVousIndividuel(o2, e2, parse("25/05/2020")),
			new RendezVousIndividuel(o2, e12, parse("25/05/2020")),
			new RendezVousIndividuel(o2, e21, parse("25/05/2020")),
			new RendezVousIndividuel(o2, e45, parse("25/05/2020"))
		);
		
		ecole.journeesAbsence = Arrays.asList(
			new JourneeAbsence(d1, parse("22/05/2020")),
			new JourneeAbsence(d1, parse("23/05/2020")),
			new JourneeAbsence(d1, parse("24/05/2020")),
			new JourneeAbsence(d1, parse("25/05/2020")),
			new JourneeAbsence(d1, parse("26/05/2020")),
			new JourneeAbsence(d1, parse("27/05/2020")),
			new JourneeAbsence(d1, parse("28/05/2020")),
			new JourneeAbsence(d1, parse("29/05/2020"))
		);
		
		// Cas de test
		Collection<Utilisateur> usersARisque1 = ecole.extraireUtilisateursARisque(e4, parse("14/04/2020"));
		Collection<Utilisateur> usersARisque2 = ecole.extraireUtilisateursARisque(e9, parse("22/05/2020"));
		Collection<Utilisateur> usersARisque3 = ecole.extraireUtilisateursARisque(d4, parse("29/05/2020"));
		
		// Affichage des résultats
		System.out.println("-----------------------------------------------");
		System.out.println("Utilisateurs à risque dans le cas n°1 : " + usersARisque1.size());
		System.out.println("-----------------------------------------------");
		printUsers(usersARisque1);
		
		System.out.println("-----------------------------------------------");
		System.out.println("Utilisateurs à risque dans le cas n°2 : " + usersARisque2.size());
		System.out.println("-----------------------------------------------");
		printUsers(usersARisque2);
		
		System.out.println("-----------------------------------------------");
		System.out.println("Utilisateurs à risque dans le cas n°3 : " + usersARisque3.size());
		System.out.println("-----------------------------------------------");
		printUsers(usersARisque3);
	}

	private static Date parse(String dateString) {
		try {
			return DATE_FORMAT.parse(dateString);
		} catch (ParseException e) {
			throw new RuntimeException("Invalid date: " + dateString, e);
		}
	}
	
	private static void printUsers(Collection<Utilisateur> users) {
		for (Utilisateur utilisateur : users) {
			System.out.println(utilisateur.getClass().getSimpleName() + " : " + utilisateur.prenom + " " + utilisateur.nom);
		}
	}
}
