
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
  
  import com.ppe.entites.BookingCar; import
  com.ppe.interfaceMetier.BookingCarInterface;
  
  @RestController
  
  @RequestMapping("/BookingCar")
  
  @CrossOrigin(origins = "*", allowedHeaders = "*") 
  
  public class BookingCarRest
  {
  
  
  @Autowired private BookingCarInterface bk;
  
  @PostMapping("/add") public void save(@RequestBody BookingCar v)
  
  { bk.add(v); }
  
  @GetMapping("/get") public Collection<BookingCar> findALL() { return
  bk.getAll(); }
  
  @GetMapping("/getNom/{id}") public BookingCar getNom(@PathVariable(value =
  "id") Long id) { return bk.getId(id); }
  
  @DeleteMapping("/delete/{id}") public void supprimer(@PathVariable(value =
  "id") Long id) { bk.delete(id); }
  
  @PutMapping("edit") // modification public void update (@RequestBody
  public void update(BookingCar v)
  
  { bk.update(v); }
  
  
  
  }
 