package com.ppe.metierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppe.entites.Voiture;
import com.ppe.interfaceMetier.VoitureInterface;
import com.ppe.repository.VoitureRepository;

@Service
public class VoitureService implements VoitureInterface {

	@Autowired
	private VoitureRepository vr;
	@Transactional
	
	@Override
	public Collection<Voiture> getAll() {
		return vr.findAll();
	}

	@Override
	public Voiture getId(Long id) {
		return vr.getOne(id);
	}

	@Override
	public void delete(long id) {
		vr.deleteById(id);
	}

	@Override
	public Voiture add(Voiture c) {
		return vr.save(c);
	}

	@Override
	public Voiture update(Voiture c) {
		return vr.saveAndFlush(c);
	}

}
