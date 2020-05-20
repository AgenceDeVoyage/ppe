package com.ppe.entites;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
@Entity
public class Voyage  {

	@Id
		@GeneratedValue
		private Long id;
		private String Nom;
		private String Description;
		private String TarifP;
		private String TarifBc;
		private String TarifNc;
		private String Nb;
        private String image;
        
        @ManyToOne
    	private FileModel filemodel;
        
		public Voyage() {
		}

		public Voyage(Long id, String nom, String description, String tarifP, String tarifBc, String tarifNc, String nb,
				String image, FileModel filemodel) {
			super();
			this.id = id;
			Nom = nom;
			Description = description;
			TarifP = tarifP;
			TarifBc = tarifBc;
			TarifNc = tarifNc;
			Nb = nb;
			this.image = image;
			this.filemodel = filemodel;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNom() {
			return Nom;
		}

		public void setNom(String nom) {
			Nom = nom;
		}

		public String getDescription() {
			return Description;
		}

		public void setDescription(String description) {
			Description = description;
		}

		public String getTarifP() {
			return TarifP;
		}

		public void setTarifP(String tarifP) {
			TarifP = tarifP;
		}

		public String getTarifBc() {
			return TarifBc;
		}

		public void setTarifBc(String tarifBc) {
			TarifBc = tarifBc;
		}

		public String getTarifNc() {
			return TarifNc;
		}

		public void setTarifNc(String tarifNc) {
			TarifNc = tarifNc;
		}

		public String getNb() {
			return Nb;
		}

		public void setNb(String nb) {
			Nb = nb;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public FileModel getFilemodel() {
			return filemodel;
		}

		public void setFilemodel(FileModel filemodel) {
			this.filemodel = filemodel;
		}

		

		

		
		
        
        
        
	
	

}
