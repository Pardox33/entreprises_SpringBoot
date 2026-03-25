package com.nadia.entreprises.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nadia.entreprises.dto.EntreprisesDTO;
import com.nadia.entreprises.entities.Entreprise;
import com.nadia.entreprises.service.EntrepriseService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EntrepriseRestController {
	
	@Autowired
	EntrepriseService entrepriseService;
	
	@RequestMapping(method=RequestMethod.GET)
	List<EntreprisesDTO> getAllEntreprises()
	{
		return entrepriseService.getAllEntreprises();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET) 
	public EntreprisesDTO getEntrepriseById(@PathVariable("id") Long id) {  
	return entrepriseService.getEntreprise(id); 
	}
	
	
	@RequestMapping(method = RequestMethod.POST) 
	public EntreprisesDTO createEntreprise(@RequestBody EntreprisesDTO entrepriseDto) { 
	return entrepriseService.saveEntreprise(entrepriseDto); 
	} 
	
	
	@RequestMapping(method = RequestMethod.PUT)
	public EntreprisesDTO updateEntreprise(@RequestBody EntreprisesDTO entrepriseDto) {
	    return entrepriseService.updateEntreprise(entrepriseDto);
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE) 
	public void deleteEntreprise(@PathVariable("id") Long id) 
	{ 
		entrepriseService.deleteEntrepriseById(id); 
	}
	
	
	@RequestMapping(value="/prodscat/{idSec}",method = RequestMethod.GET) 
	public List<Entreprise> getEntrepriseByCatId(@PathVariable("idSec") Long idSec) { 
	return entrepriseService.findBySecteurIdSec(idSec); 
	}
}
