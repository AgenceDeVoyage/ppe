package com.ppe.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class RentCarLocation {

	@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		private String nom;
		public RentCarLocation(Long id, String nom) {
			super();
			this.id = id;
			this.nom = nom;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		
		
		

	
	
}
