package com.ppe.interfaceMetier;

import java.util.Collection;

import com.ppe.entites.BookingHotel;

public interface BookingHotelInterface {
	
	public Collection<BookingHotel> getAll();
	public BookingHotel getId(Long id);
	public void delete(long id);
	public BookingHotel add (BookingHotel c );
	public BookingHotel update (BookingHotel c );
	
	
	

}
