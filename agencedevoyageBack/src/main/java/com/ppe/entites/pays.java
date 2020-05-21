package com.ppe.entites;

import java.util.UUID;

public class pays {
	private UUID id;
	private String nationalite;
	private String libelle;
	public pays(UUID uuid, String nationalite, String libelle) {
		super();
		this.id = uuid;
		this.nationalite = nationalite;
		this.libelle = libelle;
	}
	public pays() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
