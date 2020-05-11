
  package com.ppe.metierService;
  
  import java.util.Collection;
  
  import javax.transaction.Transactional;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Service;
  
  import com.ppe.entites.BookingCar; import
  com.ppe.interfaceMetier.BookingCarInterface; import
  com.ppe.repository.BookingCarRepository;
  
  @Service public class BookingCarService implements BookingCarInterface {
  
  @Autowired private BookingCarRepository bk;
  
  @Override
  
  @Transactional
  
  public Collection<BookingCar> getAll() { // TODO Auto-generated method stub
  return bk.findAll(); }
  
  @Override public BookingCar getId(Long id) { // TODO Auto-generated method
   return bk.getOne(id) ; }
  
  @Override public void delete(long id) { // TODO Auto-generated method stub
  bk.deleteById(id); }
  
  @Override public BookingCar add(BookingCar c) { // TODO Auto-generated method
   return bk.save(c); }
  
  @Override public BookingCar update(BookingCar c) { // TODO Auto-generated
   return bk.saveAndFlush(c); }
  
  }
 