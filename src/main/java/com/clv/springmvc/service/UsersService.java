package com.clv.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clv.springmvc.dao.UsersDao;
import com.clv.springmvc.dto.Users;

@Component
public class UsersService {
	@Autowired
	UsersDao dao;
	
	public boolean saveUser(Users users) {
		return dao.saveUser(users);
	}
	
	public boolean deleteUser(int id) {
		return dao.deletUser(id);
	}
	
	public boolean updateUser(int id, Users users) {
		return dao.updateUser(id, users);
	}
	
	public List<Users> getAllUsers() {
		return dao.getAllUsers();
	}
	
	public Users getUsersById(int id) {
		return dao.getUserById(id);
	}
}
