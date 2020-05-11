
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
  
  import com.ppe.entites.BookingTravel; import
  com.ppe.interfaceMetier.BookingTravelInterface;
  
  @RestController
  
  @RequestMapping("/BookingTravel")
  
  @CrossOrigin(origins = "*", allowedHeaders = "*") public class
  BookingTravelRest {
  
  
  @Autowired private BookingTravelInterface bt;
  
  @PostMapping("/add") public void save(@RequestBody BookingTravel v)
  
  { bt.add(v); }
  
  @GetMapping("/get") public Collection<BookingTravel> findALL() { return
  bt.getAll(); }
  
  @GetMapping("/getNom/{id}") public BookingTravel getNom(@PathVariable(value =
  "id") Long id) { return bt.getId(id); }
  
  @DeleteMapping("/delete/{id}") public void supprimer(@PathVariable(value =
  "id") Long id) { bt.delete(id); }
  
  @PutMapping("edit") // modification public void update (@RequestBody
  public void update(BookingTravel v)
  
  { bt.update(v); }
  
  
  }
 