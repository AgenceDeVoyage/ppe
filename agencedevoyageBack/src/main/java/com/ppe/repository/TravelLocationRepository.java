
  package com.ppe.repository;
  
  import org.springframework.data.jpa.repository.JpaRepository;
  
  import com.ppe.entites.TravelLocation;
  
  public interface TravelLocationRepository extends
  JpaRepository<TravelLocation,Long> {
  
  }
 