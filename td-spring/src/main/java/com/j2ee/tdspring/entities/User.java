package com.j2ee.tdspring.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
public class User {
	@Id
	@Column(name = "username")
	private String username;
	
	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "telephone")
	private String telephone;
	
	@ManyToMany(mappedBy = "users")
	@JsonIgnore
	private List<Sortie> sorties = new ArrayList<>();

	
	public List<Sortie> getSorties() {
		return sorties;
	}
	public void setSorties(List<Sortie> sorties) {
		this.sorties = sorties;
	}
	public void addSortie(Sortie sortie) {
		this.sorties.add(sortie);
	}
	public void removeSortie(Sortie sortie) {
		this.sorties.remove(sortie);
	}
	
	
	public String getUsername() {
		return this.username;
	}
	public User setUsername(String username) {
		this.username = username;
		return this;
	}
	
	public User setFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}
	
	public User setLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}
	
	public User setTelephone(String telephone) {
		this.telephone = telephone;
		return this;
	}

	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getTelephone() {
		return telephone;
	}

}
