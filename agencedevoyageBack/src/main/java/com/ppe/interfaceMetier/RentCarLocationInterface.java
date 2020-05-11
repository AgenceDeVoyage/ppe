package com.ppe.interfaceMetier;

import java.util.Collection;

import com.ppe.entites.RentCarLocation;

public interface RentCarLocationInterface {
	
	public Collection<RentCarLocation> getAll();
	public RentCarLocation getId(Long id);
	public void delete(long id);
	public RentCarLocation add (RentCarLocation c );
	public RentCarLocation update (RentCarLocation c );

}
