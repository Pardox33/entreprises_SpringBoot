package com.nadia.entreprises.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nadia.entreprises.entities.Entreprise;
<<<<<<< HEAD
import com.nadia.entreprises.entities.Secteur;
=======
>>>>>>> 808a62b35576986f7545f437f3853d912ac4ca5e

public interface EntrepriseService {
	Entreprise saveEntreprise(Entreprise e);
	Entreprise updateEntreprise(Entreprise e);
	void deleteEntreprise(Entreprise e);
	void deleteEntrepriseById(Long id);
	Entreprise getEntreprise(Long id);
	List<Entreprise> getAllEntreprises();
	Page<Entreprise> getAllEntreprisesParPage(int page,int size);
<<<<<<< HEAD
	
	 List<Entreprise> findByNomEnt(String nom); 
	 List<Entreprise> findByNomEntContains(String nom); 
	 List<Entreprise> findByChiffreAff (String nom, Double chiffreAff); 
	 List<Entreprise> findBySecteur (Secteur secteur); 
	 List<Entreprise> findBySecteurIdSec(Long id); 
	 List<Entreprise> findByOrderByNomEntAsc(); 
	 List<Entreprise> trierEntreprisesNomsChiffre();
=======
>>>>>>> 808a62b35576986f7545f437f3853d912ac4ca5e
}
