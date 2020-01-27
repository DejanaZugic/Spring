package com.ris.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Kategorija;

import model.Recept;

public interface ReceptRepository extends JpaRepository<Recept, Integer>{
		List<Recept> findByKategorija(Kategorija k);
		@Query("select r from Recept r where r.imeRecepta = :ime")
		public Recept poNazivu(@Param("ime")String ime);
}
