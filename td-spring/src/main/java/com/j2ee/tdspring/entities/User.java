package com.j2ee.tdspring.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@Column(name = "username")
	@NotNull
	private String username;
	
	@Column(name = "firstname")
	@NotNull
	private String firstname;

	@Column(name = "lastname")
	@NotNull
	private String lastname;
	
	@Column(name = "telephone")
	private String telephone;
	
	@Column(columnDefinition = "varchar")
	private Role role;
	
	@Column
	@JsonIgnore
	private String password;
	
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
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
