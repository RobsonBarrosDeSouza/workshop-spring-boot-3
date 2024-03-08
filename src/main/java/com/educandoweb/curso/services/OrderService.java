package com.educandoweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.curso.entities.Order;
import com.educandoweb.curso.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findByid(Long id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
		
	}
	
	public Order createUser(Order order) {
		Order or = new Order();
		or.setClient(order.getClient());
		or.setId(order.getId());
		or.setMoment(order.getMoment());

		orderRepository.save(or);
		
		return or;
		
	}
}
