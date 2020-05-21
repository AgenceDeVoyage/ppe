package com.ppe.metierService;

import java.awt.print.Pageable;
import java.util.Collection;

import javax.transaction.Transactional;
import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppe.entites.DateDepart;
import com.ppe.interfaceMetier.DateDepartInterface;
import com.ppe.repository.DateDepartRespository;



@Service
public class DateDepartService   {
	
	@Autowired
	private DateDepartRespository vr;
	
	
	public Collection<DateDepart> getAll(Pageable pageable) {
	
		return vr.findAll(pageable);
	}

	

	
}
