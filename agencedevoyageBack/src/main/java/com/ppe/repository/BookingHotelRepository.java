
  package com.ppe.repository;
  
  import org.springframework.data.jpa.repository.JpaRepository;
  
  import com.ppe.entites.BookingHotel;
  
  public interface BookingHotelRepository extends JpaRepository
  <BookingHotel,Long> {
  
  }
 