package com.ppe.metierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppe.entites.Reservation;
import com.ppe.interfaceMetier.ReservationInterface;
import com.ppe.repository.ReservationRepository;

@Service
public class ReservationService implements ReservationInterface {

	@Autowired
	private ReservationRepository vr;
	@Transactional
	
	@Override
	public Collection<Reservation> getAll() {
		return vr.findAll();
	}

	@Override
	public void delete(long id) {
		vr.deleteById((int) id);
	}

	@Override
	public Reservation add(Reservation c) {
		return vr.save(c);
	}

	@Override
	public Reservation update(Reservation c) {
		return vr.saveAndFlush(c);
	}

}
