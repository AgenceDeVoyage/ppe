package com.ppe.interfaceMetier;

import java.util.Collection;
import com.ppe.entites.Reservation;

public interface ReservationInterface {
	public Collection<Reservation> getAll();
	public void delete(long id);
	public Reservation add (Reservation c );
	public Reservation update (Reservation c );


	}
