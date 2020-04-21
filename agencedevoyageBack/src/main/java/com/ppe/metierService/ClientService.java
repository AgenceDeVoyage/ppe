package com.ppe.metierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppe.entites.Client;
import com.ppe.interfaceMetier.ClientInterface;
import com.ppe.repository.ClientRespository;

@Service
public class ClientService implements ClientInterface {
	
	
	@Autowired
	private ClientRespository vr;
	@Transactional

	@Override
	public Collection<Client> getAll() {
		return vr.findAll();
	}

	@Override
	public Client getId(Long id) {
		return vr.getOne(id);
	}

	@Override
	public void delete(long id) {
		vr.deleteById(id);
	}

	@Override
	public Client add(Client c) {
		return vr.save(c);
	}

	@Override
	public Client update(Client c) {
		return vr.saveAndFlush(c);
	}

}
