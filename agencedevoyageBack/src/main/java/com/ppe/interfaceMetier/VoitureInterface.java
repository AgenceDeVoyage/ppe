package com.ppe.interfaceMetier;

import java.util.Collection;

import com.ppe.entites.Voiture;

public interface VoitureInterface {
	public Collection<Voiture> getAll();
	public Voiture getId(Long id);
	public void delete(long id);
	public Voiture add (Voiture v );
	public Voiture update (Voiture c );

}
