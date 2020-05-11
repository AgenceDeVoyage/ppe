package com.ppe.interfaceMetier;

import java.util.Collection;

import com.ppe.entites.Destination;

public interface DestinationInterface {
	
	public Collection< Destination> getAll();
	public  Destination getId(Long id);
	public void delete(long id);
	public  Destination add ( Destination c );
	public  Destination update ( Destination c );

}
