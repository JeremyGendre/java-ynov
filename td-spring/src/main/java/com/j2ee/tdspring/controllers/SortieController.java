package com.j2ee.tdspring.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.j2ee.tdspring.entities.Sortie;
import com.j2ee.tdspring.entities.User;
import com.j2ee.tdspring.services.SortieService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class SortieController {

	@Autowired
	private SortieService sortieService;

	@RequestMapping(path = "/sortie", method = RequestMethod.GET)
	public Sortie getSortie(@RequestParam(value = "id") Long id) {
		return sortieService.getSortieById(id);
	}
	
	@RequestMapping(path = "/add-test-sortie", method = RequestMethod.GET)
	public void addTestSortie() {
		Sortie sortie = new Sortie();
	}
	
	@Valid
	@Operation(summary = "Création ou mise à jour d'une sortie")
	@RequestMapping(path = "/sortie", method = RequestMethod.PUT)
	public Sortie addOrUpdateSortie(@RequestBody Sortie sortie) {
		sortieService.createOrUpdate(sortie);
		return sortie;
	}
	
	@Operation(summary = "Ajout d'un utilisateur sur une sortie")
	@RequestMapping(path = "/sortie/{idSortie}/add-user/{username}", method = RequestMethod.PUT)
	public Sortie addUserToSortie(@PathVariable("idSortie") Long idSortie, @PathVariable("username") String username) {
		return sortieService.addUserToSortie(idSortie, username);
	}
	
	@Operation(summary = "Suppression d'un utilisateur sur une sortie")
	@RequestMapping(path = "/sortie/{idSortie}/remove-user/{username}", method = RequestMethod.PUT)
	public Sortie removeUserToSortie(@PathVariable("idSortie") Long idSortie, @PathVariable("username") String username) {
		return sortieService.removeUserToSortie(idSortie, username);
	}
	
	@Operation(summary = "Suppression d'une sortie à partir de son identifiant")
	@RequestMapping(path = "/sortie", method = RequestMethod.DELETE)
	public void deleteSortie(@RequestParam(value = "id") Long id) {
		Sortie sortie= sortieService.getSortieById(id);
		sortieService.deleteSortie(sortie);
	}
}
