package com.ppe.entites;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
@Entity
public class BookingHotel extends Booking {

	public BookingHotel(Long numéro_reservation, @NotNull Date dateDebutReservation, @NotNull Date dateFinReservation) {
		super(numéro_reservation, dateDebutReservation, dateFinReservation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long nbchambre;
	private Long nbchild;
	private Long nbadult;
	public BookingHotel(Long numéro_reservation, @NotNull Date dateDebutReservation, @NotNull Date dateFinReservation,
			Long nbchambre, Long nbchild, Long nbadult) {
		super(numéro_reservation, dateDebutReservation, dateFinReservation);
		this.nbchambre = nbchambre;
		this.nbchild = nbchild;
		this.nbadult = nbadult;
	}
	public Long getNbchambre() {
		return nbchambre;
	}
	public void setNbchambre(Long nbchambre) {
		this.nbchambre = nbchambre;
	}
	public Long getNbchild() {
		return nbchild;
	}
	public void setNbchild(Long nbchild) {
		this.nbchild = nbchild;
	}
	public Long getNbadult() {
		return nbadult;
	}
	public void setNbadult(Long nbadult) {
		this.nbadult = nbadult;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	
	
}
