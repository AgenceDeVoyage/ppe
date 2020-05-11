package com.ppe.interfaceMetier;

import java.util.Collection;

import com.ppe.entites.Hotel;

public interface HotelInterface {
	
	public Collection<Hotel> getAll();
	public Hotel getId(Long id);
	public void delete(long id);
	public Hotel add (Hotel c );
	public Hotel update (Hotel c );

}
