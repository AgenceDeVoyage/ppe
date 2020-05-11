package com.ppe.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Destination {
	@Id
	@GeneratedValue
	private Long Id;
	private String ville;
	private String paye ;
	public Destination(Long id, String ville, String paye) {
		super();
		Id = id;
		this.ville = ville;
		this.paye = paye;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPaye() {
		return paye;
	}
	public void setPaye(String paye) {
		this.paye = paye;
	}
	
	
	
	

}
