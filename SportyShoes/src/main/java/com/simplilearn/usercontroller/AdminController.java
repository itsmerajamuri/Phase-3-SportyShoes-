package com.simplilearn.usercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simplilearn.entity.Admin;
import com.simplilearn.service.AdminServiceImp;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminServiceImp serviceImp;
	@GetMapping("/adminPage")
	public String getAminDetails(Model model) {
		
		List<Admin> list= serviceImp.adminList();
		model.addAttribute("lists", list);
		
		return "AdminPage";
		
	}
	
	@GetMapping("/ChangePassword/{id}")
	public String updateAdminPassword(@PathVariable (value = "id") int id,Model model) {
		
		Admin admin= serviceImp.updatePassword(id);
		model.addAttribute("password", admin);
		
		return "updateForm";
		
	}
	
	@PostMapping("/PasswordChanged")
	public String addPassword(@ModelAttribute("password") Admin admin) {
		
		serviceImp.AddPassword(admin);
		
		return "PasswordChangedsuccessfully";
		
	}
	

}
