package com.simplilearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Admin;
import com.simplilearn.repository.AdminRepository;

@Service
public class AdminServiceImp implements AdminService{

	  @Autowired
	  AdminRepository adminRepository;
	
	public List<Admin> adminList() {
		List<Admin> list= adminRepository.findAll();
		
		
		
		return list ;
	}


	public Admin updatePassword(int id) {
		Optional<Admin> optional= adminRepository.findById(id);
		Admin admin=null;
		if(optional.isPresent()) {
			admin=optional.get();
		}
		else {
			throw new ArithmeticException("id is not found");
		}
		return admin;
	}


	@Override
	public void AddPassword(Admin admin) {
		adminRepository.save(admin);
		
	}


	

}
