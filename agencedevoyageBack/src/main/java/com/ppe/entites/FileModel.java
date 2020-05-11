package com.ppe.entites;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonView;


@Entity
public class FileModel {
    @Id
    @GeneratedValue
    
    private Long id;

    private String name;

    private String mimetype;

    @Lob
    private byte[] pic;
    
   

	public FileModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FileModel(Long id, String name, String mimetype, byte[] pic) {
		super();
		this.id = id;
		this.name = name;
		this.mimetype = mimetype;
		this.pic = pic;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMimetype() {
		return mimetype;
	}

	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}


	
   
   
}