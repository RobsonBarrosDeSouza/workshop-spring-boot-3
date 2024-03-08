package com.educandoweb.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.curso.entities.Order;
import com.educandoweb.curso.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping(value = "findAll")
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = orderService.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = orderService.findByid(id);
		return ResponseEntity.ok().body(obj);
	}
	
//	@PostMapping(value = "/createOrder")
//	public ResponseEntity<Order> createOrder(@RequestBody Order order){
//		Order us = orderService.createOrder(order);
//		return ResponseEntity.ok().body(us);
//		
//	}
 	
}
