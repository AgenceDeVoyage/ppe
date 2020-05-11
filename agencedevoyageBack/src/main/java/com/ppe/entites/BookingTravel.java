package com.ppe.entites;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
@Entity
public class BookingTravel extends Booking {

	public BookingTravel(Long numéro_reservation, @NotNull Date dateDebutReservation,
			@NotNull Date dateFinReservation) {
		super(numéro_reservation, dateDebutReservation, dateFinReservation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long nbperso;
	private Long nbnuit;
	@ManyToOne
	private TravelLocation travelLocation;
	public BookingTravel(Long numéro_reservation, @NotNull Date dateDebutReservation, @NotNull Date dateFinReservation,
			Long nbperso, Long nbnuit) {
		super(numéro_reservation, dateDebutReservation, dateFinReservation);
		this.nbperso = nbperso;
		this.nbnuit = nbnuit;
	}
	public Long getNbperso() {
		return nbperso;
	}
	public void setNbperso(Long nbperso) {
		this.nbperso = nbperso;
	}
	public Long getNbnuit() {
		return nbnuit;
	}
	public void setNbnuit(Long nbnuit) {
		this.nbnuit = nbnuit;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
