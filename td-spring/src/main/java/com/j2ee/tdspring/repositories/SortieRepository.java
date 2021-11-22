package com.j2ee.tdspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j2ee.tdspring.entities.Sortie;

public interface SortieRepository extends JpaRepository<Sortie, Long> {

}
