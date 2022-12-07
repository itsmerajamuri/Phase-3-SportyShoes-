package com.simplilearn.usercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simplilearn.entity.User;
import com.simplilearn.service.UserServiceImp;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserServiceImp userServiceImp;
	
	@GetMapping("/SignedUpusers")
	public String AllUsersSignedup(Model model) {
		List<User> list= userServiceImp.getAllUsers();
		model.addAttribute("users", list);
		return "usersSignedup";
		
		
	}

}
