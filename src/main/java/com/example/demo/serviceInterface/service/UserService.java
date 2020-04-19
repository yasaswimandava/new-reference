package com.example.demo.serviceInterface.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.serviceInterface.UserInterface;
@Service
public class UserService implements UserInterface{
@Autowired
UserRepository userRepo;

	@Override
	public List<User> listAllUsers() {
		return userRepo.findAll();
	}
	@Override
	public void saveUser(User user) {
		userRepo.save(user);
	}
	

}
