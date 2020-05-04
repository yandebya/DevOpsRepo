package com.drapeau.clsse;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class EntiteDrapeau {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_dr;
	private String libelle_dr;
	
	@ManyToMany
	@JoinTable(name="Drap_Coul",joinColumns=@JoinColumn(name="Drap"), inverseJoinColumns=@JoinColumn(name="Coul"))
	private Set<EntiteCouleur> couleur;
	
	

	public EntiteDrapeau(Long id_dr, String libelle_dr, Set<EntiteCouleur> couleur) {
		super();
		this.id_dr = id_dr;
		this.libelle_dr = libelle_dr;
		this.couleur = couleur;
	}
	public EntiteDrapeau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId_dr() {
		return id_dr;
	}
	public void setId_dr(Long id_dr) {
		this.id_dr = id_dr;
	}
	public String getLibelle_dr() {
		return libelle_dr;
	}
	public void setLibelle_dr(String libelle_dr) {
		this.libelle_dr = libelle_dr;
	}
	public Set<EntiteCouleur> getCouleur() {
		return couleur;
	}
	public void setCouleur(Set<EntiteCouleur> couleur) {
		this.couleur = couleur;
	}

	
	

}
