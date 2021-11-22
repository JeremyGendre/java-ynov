package com.j2ee.tdspring.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "sorties")
public class Sortie {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	@NotNull
	private String name;
	
	@Column
	private String description;
	
	@Column
	@NotNull
	private Date date;
	
	@Column
	private float duration;
	
	@Max(5)
	@Min(0)
	@Column
	private int complexity;
	
	@Column
	private String place;
	
	@ManyToMany
	@JoinTable( name = "sorties_users", 
		joinColumns = @JoinColumn( name = "sortie_id" ),
		inverseJoinColumns = @JoinColumn( name = "username" )) 
	private List<User> users = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public int getComplexity() {
		return complexity;
	}

	public void setComplexity(int complexity) {
		this.complexity = complexity;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public List<User> getUsers() {
		return users;
	}

	public Sortie setUsers(List<User> users) {
		this.users = users;
		return this;
	}
	
	public Sortie addUser(User user) {
		if(!this.users.contains(user)) {
			this.users.add(user);
			user.addSortie(this);
		}
		return this;
	}
	
	public Sortie removeUser(User user) {
		this.users.remove(user);
		user.removeSortie(this);
		return this;
	}

}
