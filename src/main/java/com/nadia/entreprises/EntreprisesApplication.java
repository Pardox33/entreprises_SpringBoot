package com.nadia.entreprises;

<<<<<<< HEAD
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntreprisesApplication {

=======
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nadia.entreprises.entities.Entreprise;
import com.nadia.entreprises.service.EntrepriseService;

@SpringBootApplication
public class EntreprisesApplication implements CommandLineRunner{
	
	@Autowired
	EntrepriseService entrepriseService;
	
>>>>>>> 808a62b35576986f7545f437f3853d912ac4ca5e
	public static void main(String[] args) {
		SpringApplication.run(EntreprisesApplication.class, args);
	}

<<<<<<< HEAD
=======
	@Override
	public void run(String... args) throws Exception {
		entrepriseService.saveEntreprise(new Entreprise("aaa",566.4,new Date(),"aaa.@gmail.com"));
		entrepriseService.saveEntreprise(new Entreprise("bbb",751.4,new Date(),"bbb.@gmail.com"));
		entrepriseService.saveEntreprise(new Entreprise("ccc",940.4,new Date(),"ccc.@gmail.com"));
		
	}

>>>>>>> 808a62b35576986f7545f437f3853d912ac4ca5e
}
