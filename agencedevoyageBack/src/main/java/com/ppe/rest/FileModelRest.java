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

import com.ppe.entites.FileModel;
import com.ppe.interfaceMetier.FileModelInterface;



@RestController
@RequestMapping("/FileModel")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FileModelRest {
	
	@Autowired
	private FileModelInterface fm;
	@PostMapping("/add") 
	public void save(@RequestBody FileModel v)
	
	{	fm.add(v);
	}
	@GetMapping("/get")
	public Collection<FileModel> findALL()
	{
		return fm.getAll();
	}
	@GetMapping("/getNom/{id}")
	public FileModel getNom(@PathVariable(value = "id") Long id)
	{
		return fm.getId(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		fm.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody FileModel v)
	
	{
	fm.update(v);
	}

}
