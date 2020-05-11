
  package com.ppe.metierService;
  
  import java.util.Collection;
  
  import javax.transaction.Transactional;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Service;
  
  import com.ppe.entites.TravelLocation; import
  com.ppe.interfaceMetier.TravelLocationInterface; import
  com.ppe.repository.TravelLocationRepository;
  
  @Service
  
  public class TravelLocationService implements TravelLocationInterface {
  
  @Autowired private TravelLocationRepository tl;
  
  @Transactional
  
  @Override public Collection<TravelLocation> getAll() { // TODO Auto-generated
  return tl.findAll(); }
  
  @Override public TravelLocation getId(Long id) { // TODO Auto-generated
   return tl.getOne(id); }
  
  @Override public void delete(long id) { // TODO Auto-generated method stub
  tl.deleteById(id); }
  
  @Override public TravelLocation add(TravelLocation c) { // TODO
   return tl.save(c); }
  
  @Override public TravelLocation update(TravelLocation c) { // TODO
   return tl.saveAndFlush(c); }
  
  }
 