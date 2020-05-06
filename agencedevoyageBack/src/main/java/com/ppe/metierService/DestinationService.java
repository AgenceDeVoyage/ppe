package com.ppe.metierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppe.entites.Destination;
import com.ppe.interfaceMetier.DestinationInterface;
import com.ppe.repository.DestinationRepository;

@Service

public class DestinationService implements DestinationInterface {
	@Autowired
	private DestinationRepository dh;
	@Transactional
	@Override
	public Collection<Destination> getAll() {
		// TODO Auto-generated method stub
		return dh.findAll();
	}

	@Override
	public Destination getId(Long id) {
		// TODO Auto-generated method stub
		return dh.getOne(id);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		dh.deleteById(id);
	}

	@Override
	public Destination add(Destination c) {
		// TODO Auto-generated method stub
		return dh.save(c);
	}

	@Override
	public Destination update(Destination c) {
		// TODO Auto-generated method stub
		return dh.saveAndFlush(c);
	}

}
