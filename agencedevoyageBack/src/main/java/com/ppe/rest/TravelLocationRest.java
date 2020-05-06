
  package com.ppe.rest;
  
 import java.util.Collection;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.web.bind.annotation.CrossOrigin; import
  org.springframework.web.bind.annotation.DeleteMapping; import
  org.springframework.web.bind.annotation.GetMapping; import
  org.springframework.web.bind.annotation.PathVariable; import
  org.springframework.web.bind.annotation.PostMapping; import
  org.springframework.web.bind.annotation.PutMapping; import
  org.springframework.web.bind.annotation.RequestBody; import
  org.springframework.web.bind.annotation.RequestMapping; import
 org.springframework.web.bind.annotation.RestController;
 
 import com.ppe.entites.TravelLocation; import
 com.ppe.interfaceMetier.TravelLocationInterface;
  
  @RestController
  
  @RequestMapping("/TravelLocation")
  
  @CrossOrigin(origins = "*", allowedHeaders = "*")
  
  public class TravelLocationRest {
  
  @Autowired private TravelLocationInterface vf;
  
  @PostMapping("/add") public void save(@RequestBody TravelLocation v)
  
  { vf.add(v); }
  
  @GetMapping("/get") public Collection<TravelLocation> findALL() { return
  vf.getAll(); }
  
  @DeleteMapping("/delete/{id}") public void supprimer(@PathVariable(value =
  "id") Long id) {
  
  vf.delete(id); }
  
  @PutMapping("edit") // modification public void update (@RequestBody
  public void update(TravelLocation v)
  
  { vf.update(v); }
  
  
  }
 