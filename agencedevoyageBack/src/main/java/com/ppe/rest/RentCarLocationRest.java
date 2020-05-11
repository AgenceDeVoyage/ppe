
  package com.ppe.rest;
  
  import java.util.Collection;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.web.bind.annotation.DeleteMapping; import
  org.springframework.web.bind.annotation.GetMapping; import
  org.springframework.web.bind.annotation.PathVariable; import
  org.springframework.web.bind.annotation.PostMapping; import
  org.springframework.web.bind.annotation.PutMapping; import
  org.springframework.web.bind.annotation.RequestBody;
  
  import com.ppe.entites.RentCarLocation; import
  com.ppe.interfaceMetier.RentCarLocationInterface;
  
  public class RentCarLocationRest {
  
  @Autowired private RentCarLocationInterface vf;
  
  @PostMapping("/add") public void save(@RequestBody RentCarLocation v)
  
  { vf.add(v); }
  
  @GetMapping("/get") public Collection<RentCarLocation> findALL() { return
  vf.getAll(); }
  
  @GetMapping("/getNom/{id}") public RentCarLocation getNom(@PathVariable(value
  = "id") Long id) { return vf.getId(id); }
  
  @DeleteMapping("/delete/{id}") public void supprimer(@PathVariable(value =
  "id") Long id) { vf.delete(id); }
  
  @PutMapping("edit") // modification public void update (@RequestBody
  public void update(RentCarLocation v)
  
  { vf.update(v); }
 
  
  
  }
 