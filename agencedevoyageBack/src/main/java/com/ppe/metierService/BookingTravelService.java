
  package com.ppe.metierService;
  
  import java.util.Collection;
  
  import javax.transaction.Transactional;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Service;
  
  import com.ppe.entites.BookingTravel; import
  com.ppe.interfaceMetier.BookingTravelInterface; import
  com.ppe.repository.BookingTravelRepository;
  
  @Service public class BookingTravelService implements BookingTravelInterface
  {
  
  @Autowired private BookingTravelRepository bt;
  
  @Transactional
  
  @Override public Collection<BookingTravel> getAll() { // TODO Auto-generated
  return bt.findAll(); }
  
  @Override public BookingTravel getId(Long id) { // TODO Auto-generated method
   return bt.getOne(id); }
  
  @Override public void delete(long id) { // TODO Auto-generated method stub
  bt.deleteById(id); }
  
  @Override public BookingTravel add(BookingTravel c) { // TODO Auto-generated
  return bt.save(c); }
  
  @Override public BookingTravel update(BookingTravel c) { // TODO
   return bt.saveAndFlush(c); }
  
  }
 