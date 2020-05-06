
  package com.ppe.metierService;
  
  import java.util.Collection;
  
  import javax.transaction.Transactional;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Service;
  
  import com.ppe.entites.BookingHotel; import
  com.ppe.interfaceMetier.BookingHotelInterface; import
  com.ppe.repository.BookingHotelRepository;
  
  @Service
  
  public class BookingHotelService implements BookingHotelInterface{
  
  @Autowired
  private BookingHotelRepository bh;
  
  @Transactional
  
  @Override public Collection<BookingHotel> getAll() { // TODO Auto-generated
  return bh.findAll(); }
  
  @Override public BookingHotel getId(Long id) { // TODO Auto-generated method
  return bh.getOne(id); }
  
  @Override public void delete(long id) { // TODO Auto-generated method stub
  bh.deleteById(id); }
  
  @Override public BookingHotel add(BookingHotel c) { // TODO Auto-generated
   return bh.save(c); }
  
  @Override public BookingHotel update(BookingHotel c) { // TODO Auto-generated
  return bh.saveAndFlush(c); }
  
  }
 