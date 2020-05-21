package com.ppe.repository;


import java.awt.print.Pageable;
import java.util.Collection;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ppe.entites.DateDepart;

public interface DateDepartRespository extends PagingAndSortingRepository<DateDepart,Long> {
	Collection<DateDepart> findAll( Pageable pageable);
	

}