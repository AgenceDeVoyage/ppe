package com.ppe.interfaceMetier;

import java.util.Collection;

import com.ppe.entites.Client;

public interface ClientInterface {
	public Collection<Client> getAll();
	public Client getId(Long id);
	public void delete(long id);
	public Client add (Client c );
	public Client update (Client c );

	
}
