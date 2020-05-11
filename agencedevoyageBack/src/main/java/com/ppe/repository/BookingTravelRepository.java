
  package com.ppe.repository;
  
  import org.springframework.data.jpa.repository.JpaRepository;
  
  import com.ppe.entites.BookingTravel;
  
  public interface BookingTravelRepository extends JpaRepository
  <BookingTravel,Long>{
  
  }
 