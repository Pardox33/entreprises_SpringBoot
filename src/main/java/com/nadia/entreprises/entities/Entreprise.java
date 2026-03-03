package com.nadia.entreprises.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.ManyToOne;
=======
>>>>>>> 808a62b35576986f7545f437f3853d912ac4ca5e

@Entity
public class Entreprise {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEnt;
	private String nomEnt;
	private Double chiffreAff;
	private Date dateCre;
	private String email;
	
<<<<<<< HEAD
	@ManyToOne(optional=true)
	private Secteur secteur;
	
=======
>>>>>>> 808a62b35576986f7545f437f3853d912ac4ca5e
	public Entreprise() {
		super();
	}
	
	public Entreprise(String nomEnt, Double chiffreAff, Date dateCre, String email) {
		super();
		this.nomEnt = nomEnt;
		this.chiffreAff = chiffreAff;
		this.dateCre = dateCre;
		this.email = email;
	}

	public Long getIdEnt() {
		return idEnt;
<<<<<<< HEAD
	} 
	
	public void setIdEnt(Long idEnt) {
		this.idEnt = idEnt;
	}
	
	public String getNomEnt() {
		return nomEnt;
	}
	
	public void setNomEnt(String nomEnt) {
		this.nomEnt = nomEnt;
	}
	
	public Double getChiffreAff() {
		return chiffreAff;
	}
	
	public void setChiffreAff(Double chiffreAff) {
		this.chiffreAff = chiffreAff;
	}
	
	public Date getDateCre() {
		return dateCre;
	}
	
	public void setDateCre(Date dateCre) {
		this.dateCre = dateCre;
	}
	
=======
	}
	public void setIdEnt(Long idEnt) {
		this.idEnt = idEnt;
	}
	public String getNomEnt() {
		return nomEnt;
	}
	public void setNomEnt(String nomEnt) {
		this.nomEnt = nomEnt;
	}
	public Double getChiffreAff() {
		return chiffreAff;
	}
	public void setChiffreAff(Double chiffreAff) {
		this.chiffreAff = chiffreAff;
	}
	public Date getDateCre() {
		return dateCre;
	}
	public void setDateCre(Date dateCre) {
		this.dateCre = dateCre;
	}
>>>>>>> 808a62b35576986f7545f437f3853d912ac4ca5e
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "entreprise [idEnt=" + idEnt + ", nomEnt=" + nomEnt + ", chiffreAff=" + chiffreAff + ", dateCre="
				+ dateCre + ", email=" + email + "]";
	}
<<<<<<< HEAD

	public Secteur getSecteur() {
		return secteur;
	}

	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
	}
=======
	
	
>>>>>>> 808a62b35576986f7545f437f3853d912ac4ca5e
	
}
