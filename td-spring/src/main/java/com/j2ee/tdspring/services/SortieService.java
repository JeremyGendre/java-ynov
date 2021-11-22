package com.j2ee.tdspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j2ee.tdspring.entities.Sortie;
import com.j2ee.tdspring.entities.User;
import com.j2ee.tdspring.repositories.SortieRepository;

@Service
public class SortieService {

	@Autowired
	private SortieRepository sortieRepository;
	
	@Autowired
	private UserService userService;
	
	public Sortie createOrUpdate(Sortie sortie) {
		return sortieRepository.save(sortie);
	}
		
	public Sortie getSortieById(Long id) {
		return sortieRepository.findById(id).orElse(null);
	}
	
	public List<Sortie> getAllSorties(){
		return sortieRepository.findAll();
	}
	
	public void deleteSortie(Sortie sortie) {
		sortieRepository.delete(sortie);
	}
	
	public Sortie addUserToSortie(Long sortieId, String username) {
		Sortie sortie = this.getSortieById(sortieId);
		User user = userService.getUserById(username);
		sortie.addUser(user);
		return sortieRepository.save(sortie);
	}
	
	public Sortie removeUserToSortie(Long sortieId, String username) {
		Sortie sortie = this.getSortieById(sortieId);
		User user = userService.getUserById(username);
		sortie.removeUser(user);
		return sortieRepository.save(sortie);
	}
}
