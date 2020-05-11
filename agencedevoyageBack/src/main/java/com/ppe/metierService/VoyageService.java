package com.ppe.metierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppe.entites.Voyage;
import com.ppe.interfaceMetier.VoyageInterface;
import com.ppe.repository.VoyageRespository;
@Service

public class VoyageService implements VoyageInterface {
	
	@Autowired
	private VoyageRespository vg;
	@Transactional
	

	@Override
	public Collection<Voyage> getAll() {
		// TODO Auto-generated method stub
		return vg.findAll();
	}

	@Override
	public Voyage getId(Long id) {
		// TODO Auto-generated method stub
		return vg.getOne(id);
	}

	@Override
	public void delete(long id) {
		vg.deleteById(id);
	}
   
		
	

	@Override
	public Voyage add(Voyage c) {
		// TODO Auto-generated method stub
		return vg.save(c);
	}

	@Override
	public Voyage update(Voyage c) {
		// TODO Auto-generated method stub
		return vg.saveAndFlush(c);
	}

}
