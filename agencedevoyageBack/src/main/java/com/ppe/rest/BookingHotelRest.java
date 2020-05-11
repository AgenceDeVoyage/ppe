
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
  
  import com.ppe.entites.BookingHotel; import
  com.ppe.interfaceMetier.BookingHotelInterface;
  
  @RestController
  
  @RequestMapping("/BookingHote")
  
  @CrossOrigin(origins = "*", allowedHeaders = "*") public class
  BookingHotelRest {
  
  @Autowired private BookingHotelInterface bh;
  
  @PostMapping("/add") public void save(@RequestBody BookingHotel v)
  
  { bh.add(v); }
  
  @GetMapping("/get") public Collection<BookingHotel> findALL() { return
  bh.getAll(); }
  
  @GetMapping("/getNom/{id}") public BookingHotel getNom(@PathVariable(value =
  "id") Long id) { return bh.getId(id); }
  
  @DeleteMapping("/delete/{id}") public void supprimer(@PathVariable(value =
  "id") Long id) { bh.delete(id); }
  
  @PutMapping("edit") // modification public void update (@RequestBody
  public void update(BookingHotel v)
  
  { bh.update(v); }
  
  
  
  }
 