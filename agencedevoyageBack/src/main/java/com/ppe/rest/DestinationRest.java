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

import com.ppe.entites.Destination;
import com.ppe.entites.Hotel;
import com.ppe.interfaceMetier.DestinationInterface;

@RestController
@RequestMapping("/Destination")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DestinationRest {
	
	@Autowired
	private DestinationInterface dh;
	@PostMapping("/add") 
	public void save(@RequestBody Destination v)
	
	{	dh.add(v);
	}
	@GetMapping("/get")
	public Collection<Destination> findALL()
	{
		return dh.getAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
	
		dh.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Destination v)
	
	{
	dh.update(v);
	}

}
