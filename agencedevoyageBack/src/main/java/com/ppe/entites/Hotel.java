package com.ppe.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hotel {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long IdHotel;
	private String Nom;
	private int NbEtoile;
	private String Adresse ;
	private String Mail;
	private String image;
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(Long idHotel, String nom, int nbEtoile, String adresse, String mail, String image) {
		super();
		IdHotel = idHotel;
		Nom = nom;
		NbEtoile = nbEtoile;
		Adresse = adresse;
		Mail = mail;
		this.image = image;
	}

	public Long getIdHotel() {
		return IdHotel;
	}

	public void setIdHotel(Long idHotel) {
		IdHotel = idHotel;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public int getNbEtoile() {
		return NbEtoile;
	}

	public void setNbEtoile(int nbEtoile) {
		NbEtoile = nbEtoile;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
