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

import com.ppe.entites.Voyage;
import com.ppe.interfaceMetier.VoyageInterface;


@RestController
@RequestMapping("/Voyage")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VoyageRest {
	
	@Autowired
	private VoyageInterface vg;
	@PostMapping("/add") 
	public void save(@RequestBody Voyage v)
	
	{	vg.add(v);
	}
	@GetMapping("/get")
	public Collection<Voyage> findALL()
	{
		return vg.getAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
	
		vg.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Voyage v)
	
	{
	vg.update(v);
	}
	

}
