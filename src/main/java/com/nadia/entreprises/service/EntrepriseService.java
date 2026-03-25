package com.nadia.entreprises.service;

import java.util.List;


import org.springframework.data.domain.Page;

import com.nadia.entreprises.dto.EntreprisesDTO;
import com.nadia.entreprises.entities.Entreprise;
import com.nadia.entreprises.entities.Secteur;
public interface EntrepriseService {
	EntreprisesDTO saveEntreprise(EntreprisesDTO e);
	EntreprisesDTO updateEntreprise(EntreprisesDTO e);
	
	EntreprisesDTO getEntreprise(Long id);
	List<EntreprisesDTO> getAllEntreprises();
	
	
	

	Page<Entreprise> getAllEntreprisesParPage(int page,int size);
	
	void deleteEntreprise(Entreprise e);
	void deleteEntrepriseById(Long id);
	
	List<Entreprise> findByNomEnt(String nom); 
	List<Entreprise> findByNomEntContains(String nom); 
	List<Entreprise> findByChiffreAff (String nom, Double chiffreAff); 
	List<Entreprise> findBySecteur (Secteur secteur); 
	List<Entreprise> findBySecteurIdSec(Long id); 
	List<Entreprise> findByOrderByNomEntAsc(); 
	List<Entreprise> trierEntreprisesNomsChiffre();
	
	List<Secteur> getAllSecteur();
	
	EntreprisesDTO convertEntityToDto(Entreprise entreprise); 
	Entreprise convertDtoToEntity(EntreprisesDTO entrepriseDto); 

}
