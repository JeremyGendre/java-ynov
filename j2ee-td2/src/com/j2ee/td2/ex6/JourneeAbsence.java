package com.j2ee.td2.ex6;

import java.util.Date;

public class JourneeAbsence {
	MembreDuPersonnel personnelAbsent;
	Date dateAbsence;
	
	public JourneeAbsence(MembreDuPersonnel personnelAbsent, Date dateAbsence) {
		this.dateAbsence = dateAbsence;
		this.personnelAbsent = personnelAbsent;
	}
	
	
}
