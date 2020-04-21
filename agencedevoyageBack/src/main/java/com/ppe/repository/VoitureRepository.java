package com.ppe.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ppe.entites.Voiture;

public interface VoitureRepository  extends JpaRepository<Voiture,Long> {

}
