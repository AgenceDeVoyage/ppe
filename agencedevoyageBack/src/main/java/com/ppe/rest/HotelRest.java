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

import com.ppe.entites.Hotel;
import com.ppe.interfaceMetier.HotelInterface;

@RestController
@RequestMapping("/Hotel")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HotelRest {
	
	@Autowired
	private HotelInterface ht;
	@PostMapping("/add") 
	public void save(@RequestBody Hotel v)
	
	{	ht.add(v);
	}
	@GetMapping("/get")
	public Collection<Hotel> findALL()
	{
		return ht.getAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
	
		ht.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Hotel v)
	
	{
	ht.update(v);
	}
	
	

}
