package com.ppe.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreType;


@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Booking implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long numero_reservation;

	@ManyToOne
	private Client client;
	@Autowired
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	// Attention la date doit etre supérieure à la date courante
	// @Future
	@NotNull
	private Date DateDebutReservation;
	@Autowired
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	// Attention la date doit etre supérieure à la date courante
	// @Future
	@NotNull
	private Date DateFinReservation;

	public Booking(Long numéro_reservation,  @NotNull Date dateDebutReservation,
			@NotNull Date dateFinReservation) {
		super();
		this.numero_reservation = numéro_reservation;
		DateDebutReservation = dateDebutReservation;
		DateFinReservation = dateFinReservation;
	}

	public Long getNumero_reservation() {
		return numero_reservation;
	}

	public void setNumero_reservation(Long numéro_reservation) {
		this.numero_reservation = numéro_reservation;
	}


	public Date getDateDebutReservation() {
		return DateDebutReservation;
	}

	public void setDateDebutReservation(Date dateDebutReservation) {
		DateDebutReservation = dateDebutReservation;
	}

	public Date getDateFinReservation() {
		return DateFinReservation;
	}

	public void setDateFinReservation(Date dateFinReservation) {
		DateFinReservation = dateFinReservation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}