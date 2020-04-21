package com.ppe.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Voiture {
	@Id
	@GeneratedValue
	private Long Matricule;
	private String Marque;
	private String Type;
	private int Capacite;
	private String image;
	
	public Voiture() {
		super();
	}

	public Voiture(Long matricule, String marque, String type, int capacite, String image) {
		super();
		Matricule = matricule;
		Marque = marque;
		Type = type;
		Capacite = capacite;
		this.image = image;
	}

	public Long getMatricule() {
		return Matricule;
	}

	public void setMatricule(Long matricule) {
		Matricule = matricule;
	}

	public String getMarque() {
		return Marque;
	}

	public void setMarque(String marque) {
		Marque = marque;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getCapacite() {
		return Capacite;
	}

	public void setCapacite(int capacite) {
		Capacite = capacite;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	

}
