package com.ppe.metierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppe.entites.FileModel;
import com.ppe.interfaceMetier.FileModelInterface;
import com.ppe.repository.FileModelRespository;


@Service

public class FileModelService implements FileModelInterface {

	@Autowired
	private FileModelRespository fm;
	@Transactional

	@Override
	public Collection<FileModel> getAll() {
		// TODO Auto-generated method stub
		return fm.findAll();
	}

	@Override
	public FileModel getId(Long id) {
		// TODO Auto-generated method stub
		return fm.getOne(id);
	}

	@Override
	public void delete(long id) {
		fm.deleteById(id);	
	}

	@Override
	public FileModel add(FileModel c) {
		// TODO Auto-generated method stub
		return fm.save(c);
	}

	@Override
	public FileModel update(FileModel c) {
		// TODO Auto-generated method stub
		return fm.saveAndFlush(c);
	}
	
	
	
}
