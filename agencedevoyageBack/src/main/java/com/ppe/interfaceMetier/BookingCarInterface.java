package com.ppe.interfaceMetier;

import java.util.Collection;

import com.ppe.entites.BookingCar;

public interface BookingCarInterface {
	public Collection<BookingCar> getAll();
	public BookingCar getId(Long id);
	public void delete(long id);
	public BookingCar add (BookingCar c );
	public BookingCar update (BookingCar c );

}
