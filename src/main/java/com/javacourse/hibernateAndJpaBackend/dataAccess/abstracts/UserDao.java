package com.javacourse.hibernateAndJpaBackend.dataAccess.abstracts;

import java.util.List;

import com.javacourse.hibernateAndJpaBackend.entities.concretes.User;

public interface UserDao {
	
	List<User> getAll();
	void add(User user);
	void update(User user);
	void delete(User user);
	User getById(int id);
	
	
	
}
