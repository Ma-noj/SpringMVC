package com.clv.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clv.springmvc.dto.Users;

@Component
public class UsersDao {
	@Autowired
	EntityManager em;

	public boolean saveUser(Users user) {
		EntityTransaction tr = em.getTransaction();

		if (user != null) {
			tr.begin();
			em.persist(user);
			tr.commit();
			return true;
		} else {
			return false;
		}
	}

	public boolean deletUser(int id) {
		EntityTransaction tr = em.getTransaction();

		Users user = em.find(Users.class, id);
		if (user != null) {
			tr.begin();
			em.remove(user);
			tr.commit();
			return true;
		} else {
			return false;
		}
	}

	public boolean updateUser(int id, Users user) {
		EntityTransaction tr = em.getTransaction();
		Users user1 = em.find(Users.class, id);
		if (user1 != null) {
			tr.begin();
			user1.setName(user.getName());
			user1.setEmail(user.getEmail());
			user1.setPassword(user.getPassword());
			em.merge(user1);
			tr.commit();
			return true;
		} else {
			return false;
		}
	}

	public List<Users> getAllUsers() {
		String sql = "SELECT u FROM Users u ";
		Query query = em.createQuery(sql);
		return query.getResultList();
	}

	public Users getUserById(int id) {
		String sql = "SELECT u FROM Users u WHERE u.id = " + id;
		Query query = em.createQuery(sql);
		return (Users) query.getResultList().get(0);
	}
}
