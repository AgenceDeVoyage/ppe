package com.ppe.interfaceMetier;

import java.util.Collection;

import com.ppe.entites.FileModel;


public interface FileModelInterface {
	public Collection<FileModel> getAll();
	public FileModel getId(Long id);
	public void delete(long id);
	public FileModel add (FileModel c );
	public FileModel update (FileModel c );

}
