package com.clv.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.clv.springmvc.dto.Users;
import com.clv.springmvc.service.UsersService;

@Controller
public class UsersController {
	@Autowired
	UsersService service;

	@RequestMapping("/saveuser")
	public ModelAndView saveUser(@ModelAttribute Users user) {
		boolean result = service.saveUser(user);

		ModelAndView mv = new ModelAndView("display.jsp");
		if (result) {
			return mv.addObject("Meassge", "User Added Successfully!");
		} else {
			return mv.addObject("Meassge", "User Not Added!!");
		}
	}

	@RequestMapping("/userapp")
	public ModelAndView loaduser() {
		ModelAndView mv = new ModelAndView("saveuser.jsp");
		mv.addObject("user", new Users());
		return mv;
	}
	
	@RequestMapping("/display")
	public ModelAndView allUsers() {
		List<Users> users = service.getAllUsers();
		//System.out.println(users);
		ModelAndView mv = new ModelAndView("displayUsers.jsp");
		mv.addObject("users",users);
		return mv;
	}
	
	@RequestMapping("/edit")
	public ModelAndView editUser(@RequestParam(name = "id")int id) {
		Users user = service.getUsersById(id);
		ModelAndView mv = new ModelAndView("edituser.jsp");
		mv.addObject("user", user);
		return mv;
	}
	
	@RequestMapping("/updateuser")
	public ModelAndView updateuser(@ModelAttribute Users user) {
		service.updateUser(user.getId(), user);
		ModelAndView mv = new ModelAndView("display");
		mv.addObject("msg", "User Upadated Successfully");
		return mv;
	}
}
