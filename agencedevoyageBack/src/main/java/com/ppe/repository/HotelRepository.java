package com.ppe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ppe.entites.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,Long> {

}
