package com.ppe.entites;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
@Entity
public class BookingCar extends Booking {

	public BookingCar(Long numéro_reservation, @NotNull Date dateDebutReservation, @NotNull Date dateFinReservation) {
		super(numéro_reservation, dateDebutReservation, dateFinReservation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private RentCarLocation rentCarLocation;
	private long prix;
	public BookingCar(Long numéro_reservation, @NotNull Date dateDebutReservation, @NotNull Date dateFinReservation,
			long prix) {
		super(numéro_reservation, dateDebutReservation, dateFinReservation);
		this.prix = prix;
	}
	public long getPrix() {
		return prix;
	}
	public void setPrix(long prix) {
		this.prix = prix;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
