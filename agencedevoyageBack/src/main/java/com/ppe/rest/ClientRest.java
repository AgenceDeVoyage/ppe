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

import com.ppe.entites.Client;
import com.ppe.interfaceMetier.ClientInterface;

@RestController
@RequestMapping("/Client")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClientRest {
	
	@Autowired
	private ClientInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Client v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Client> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{id}")
	public Client getNom(@PathVariable(value = "id") Long id)
	{
		return vf.getId(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Client v)
	
	{
	vf.update(v);
	}

}
