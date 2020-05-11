
  package com.ppe.metierService;
  
  import java.util.Collection;
  
 import javax.transaction.Transactional;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Service;
  
  import com.ppe.entites.RentCarLocation; import
  com.ppe.interfaceMetier.RentCarLocationInterface; import
  com.ppe.repository.RentCarLocationRepository;
  
  @Service
  
  public class RentCarLocationService implements RentCarLocationInterface {
  
  @Autowired private RentCarLocationRepository rcl;
  
  @Transactional
  
  @Override public Collection<RentCarLocation> getAll() { // TODO
   return rcl.findAll(); }
  
  @Override public RentCarLocation getId(Long id) { // TODO Auto-generated
   return rcl.getOne(id); }
  
  @Override public void delete(long id) { // TODO Auto-generated method stub
  rcl.deleteById(id); }
  
  @Override public RentCarLocation add(RentCarLocation c) { // TODO
   return rcl.save(c); }
  
  @Override public RentCarLocation update(RentCarLocation c) { // TODO
   return rcl.saveAndFlush(c); }
  
  
  }
 