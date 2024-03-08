package com.educandoweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findByid(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
		
	}
	
	public User createUser(User user) {
		User us = new User();
		us.setName(user.getName());
		us.setEmail(user.getEmail());
		us.setPhone(user.getPhone());
		us.setPassword(user.getPassword());
		
		userRepository.save(us);
		
		return us;
		
	}
}
