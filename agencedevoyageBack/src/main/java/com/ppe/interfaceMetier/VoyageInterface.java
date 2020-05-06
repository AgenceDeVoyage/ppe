package com.ppe.interfaceMetier;

import java.util.Collection;

import com.ppe.entites.Voyage;

public interface VoyageInterface {
	public Collection<Voyage> getAll();
	public Voyage getId(Long id);
	public void delete(long id);
	public Voyage add (Voyage c );
	public Voyage update (Voyage c );

}
