package com.ppe.metierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppe.entites.Hotel;
import com.ppe.interfaceMetier.HotelInterface;
import com.ppe.repository.HotelRepository;

@Service

public class HotelService implements HotelInterface {
	@Autowired
	private HotelRepository ht;
	@Transactional
	@Override
	public Collection<Hotel> getAll() {
		// TODO Auto-generated method stub
		return ht.findAll();
	}

	@Override
	public Hotel getId(Long id) {
		// TODO Auto-generated method stub
		return ht.getOne(id);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		ht.deleteById(id);
	}

	@Override
	public Hotel add(Hotel c) {
		// TODO Auto-generated method stub
		return ht.save(c);
	}

	@Override
	public Hotel update(Hotel c) {
		// TODO Auto-generated method stub
		return ht.saveAndFlush(c);
	}

}
