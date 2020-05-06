package com.ppe.interfaceMetier;

import java.util.Collection;

import com.ppe.entites.TravelLocation;

public interface TravelLocationInterface {
	
	public Collection<TravelLocation> getAll();
	public TravelLocation getId(Long id);
	public void delete(long id);
	public TravelLocation add (TravelLocation c );
	public TravelLocation update (TravelLocation c );
	

}
