package com.nadia.entreprises.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nadia.entreprises.dto.EntreprisesDTO;
import com.nadia.entreprises.entities.Entreprise;
import com.nadia.entreprises.entities.Secteur;
import com.nadia.entreprises.repos.EntrepriseRepository;
import com.nadia.entreprises.repos.SecteurRepository;

@Service
public class EntrepriseServiceImp implements EntrepriseService{
	@Autowired
	EntrepriseRepository entrepriseRepository;
	
	@Autowired
	SecteurRepository secteurRepository;
	
	@Autowired 
	ModelMapper modelMapper; 
	
	@Override
	public EntreprisesDTO saveEntreprise(EntreprisesDTO e) {
		return convertEntityToDto(entrepriseRepository.save(convertDtoToEntity(e)));
	}

	@Override
	public EntreprisesDTO updateEntreprise(EntreprisesDTO e) {
		return convertEntityToDto(entrepriseRepository.save(convertDtoToEntity(e)));
	}

	@Override
	public void deleteEntreprise(Entreprise e) {
		entrepriseRepository.delete(e);
	}

	@Override
	public void deleteEntrepriseById(Long id) {
		entrepriseRepository.deleteById(id);
	}

	@Override
	public EntreprisesDTO getEntreprise(Long id) {
		return convertEntityToDto(entrepriseRepository.findById(id).get());
	}

	@Override
	public List<EntreprisesDTO> getAllEntreprises() {
		return entrepriseRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
				
		/*List<Entreprise> ents =  entrepriseRepository.findAll(); 
		List<EntreprisesDTO> listentDto = new ArrayList<>(ents.size()); 
		for (Entreprise e : ents) 
		listentDto.add(convertEntityToDto(e)); 
		return listentDto;*/
	}

	@Override
	public Page<Entreprise> getAllEntreprisesParPage(int page, int size) {
		return entrepriseRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Entreprise> findByNomEnt(String nom) {
		return entrepriseRepository.findByNomEnt(nom);
	}

	@Override
	public List<Entreprise> findByNomEntContains(String nom) {
		return entrepriseRepository.findByNomEntContains(nom);
	}

	@Override
	public List<Entreprise> findByChiffreAff(String nom, Double chiffreAff) {
		return entrepriseRepository.findByChiffreAff(nom,chiffreAff);
	}

	@Override
	public List<Entreprise> findBySecteur(Secteur secteur) {
		return entrepriseRepository.findBySecteur(secteur);
	}

	@Override
	public List<Entreprise> findBySecteurIdSec(Long id) {
		return entrepriseRepository.findBySecteurIdSec(id);
	}

	@Override
	public List<Entreprise> findByOrderByNomEntAsc() {
		return entrepriseRepository.findByOrderByNomEntAsc();
	}

	@Override
	public List<Entreprise> trierEntreprisesNomsChiffre() {
		return entrepriseRepository.trierEntreprisesNomsChiffre();
	}

	@Override
	public List<Secteur> getAllSecteur() {
		return secteurRepository.findAll() ;
	}

	@Override
	public EntreprisesDTO convertEntityToDto(Entreprise entreprise) {
		
		
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		EntreprisesDTO entrepriseDTO = modelMapper.map(entreprise,EntreprisesDTO.class); 
		return entrepriseDTO; 
		}
	    /*EntreprisesDTO dto = new EntreprisesDTO();

	    dto.setIdEnt(entreprise.getIdEnt());
	    dto.setNomEnt(entreprise.getNomEnt());
	    dto.setChiffreAff(entreprise.getChiffreAff());
	    dto.setDateCre(entreprise.getDateCre());
	    dto.setEmail(entreprise.getEmail());
	    dto.setSecteur(entreprise.getSecteur());
	    //dto.setNomSec(entreprise.getSecteur().getNomSec());

	    return dto;*/

	    /*
	    return EntreprisesDTO.builder()
	        .idEnt(entreprise.getIdEnt())
	        .nomEnt(entreprise.getNomEnt())
	        .chiffreAff(entreprise.getChiffreAff())
	        .dateCre(entreprise.getDateCre())
	        .email(entreprise.getEmail())
	        .secteur(entreprise.getSecteur())
	        .build();
	    */

	@Override 
	public Entreprise convertDtoToEntity(EntreprisesDTO entrepriseDto) { 
		Entreprise entreprise = new Entreprise();
		entreprise = modelMapper.map(entrepriseDto,Entreprise.class);
		return entreprise;
	}
		/*Entreprise entreprise = new Entreprise(); 
		
		entreprise.setIdEnt(entrepriseDto.getIdEnt()); 
		entreprise.setNomEnt(entrepriseDto.getNomEnt()); 
		entreprise.setChiffreAff(entrepriseDto.getChiffreAff()); 
		entreprise.setDateCre(entrepriseDto.getDateCre()); 
		entreprise.setSecteur(entrepriseDto.getSecteur());   
		return entreprise;  
	} */

}
