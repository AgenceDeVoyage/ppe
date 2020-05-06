package com.ppe.interfaceMetier;

import java.util.Collection;

import com.ppe.entites.BookingCar;
import com.ppe.entites.BookingTravel;

public interface BookingTravelInterface {
	
	public Collection<BookingTravel> getAll();
	public BookingTravel getId(Long id);
	public void delete(long id);
	public BookingTravel add (BookingTravel c );
	public BookingTravel update (BookingTravel c );

}
