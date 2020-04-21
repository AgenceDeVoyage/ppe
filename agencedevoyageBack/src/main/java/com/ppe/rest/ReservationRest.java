package com.ppe.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ppe.entites.Reservation;
import com.ppe.interfaceMetier.ReservationInterface;

@RestController
@RequestMapping("/Reservation")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReservationRest {
	@Autowired
	private ReservationInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Reservation v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Reservation> findALL()
	{
		return vf.getAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable Long id) {
	
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Reservation v)
	
	{
	vf.update(v);
	}

}
