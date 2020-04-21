package com.ppe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ppe.entites.Client;

public interface ClientRespository extends JpaRepository<Client,Long> {

}
