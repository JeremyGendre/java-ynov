package com.j2ee.tdspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j2ee.tdspring.entities.User;
import com.j2ee.tdspring.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public User createOrUpdate(User user) {
		return userRepository.save(user);
	}
		
	public User getUserById(String username) {
		return userRepository.findById(username).orElse(null);
	}
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public void deleteUser(User user) {
		userRepository.delete(user);
	}
}
