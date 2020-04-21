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

import com.ppe.entites.Voiture;
import com.ppe.interfaceMetier.VoitureInterface;

@RestController
@RequestMapping("/Voiture")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VoitureRest {
	@Autowired
	private VoitureInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Voiture v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Voiture> findALL()
	{
		return vf.getAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
	
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Voiture v)
	
	{
	vf.update(v);
	}
	
	

}
