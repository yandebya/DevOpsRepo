package com.drapeau.clsse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EntiteCouleur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_coul;
	private String libelle_coul;
	public EntiteCouleur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EntiteCouleur(Long id_coul, String libelle_coul) {
		super();
		this.id_coul = id_coul;
		this.libelle_coul = libelle_coul;
	}
	public Long getId_coul() {
		return id_coul;
	}
	public void setId_coul(Long id_coul) {
		this.id_coul = id_coul;
	}
	public String getLibelle_coul() {
		return libelle_coul;
	}
	public void setLibelle_coul(String libelle_coul) {
		this.libelle_coul = libelle_coul;
	}
	
	
}
