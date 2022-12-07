package com.simplilearn.service;

import java.util.List;

import com.simplilearn.entity.Admin;

public interface AdminService {
	
	public List<Admin> adminList();
	
	public Admin updatePassword(int id);
	
	public void AddPassword(Admin admin);
	
	

}
