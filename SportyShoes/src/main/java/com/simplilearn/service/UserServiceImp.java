package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.User;
import com.simplilearn.repository.UserRepository;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	UserRepository repository;
	
	public List<User> getAllUsers() {
		
		List<User> list= repository.findAll();
		
		return list;
	}

}
