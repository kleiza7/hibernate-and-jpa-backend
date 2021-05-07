package com.javacourse.hibernateAndJpaBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.hibernateAndJpaBackend.business.abstracts.UserService;
import com.javacourse.hibernateAndJpaBackend.dataAccess.abstracts.UserDao;
import com.javacourse.hibernateAndJpaBackend.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.getAll();
	}

	@Override
	@Transactional
	public void add(User user) {
		this.userDao.add(user);
		
	}

	@Override
	@Transactional
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	@Transactional
	public void delete(User user) {
		this.userDao.delete(user);
	}

	@Override
	@Transactional
	public User getById(int id) {
		return this.userDao.getById(id);
	}

}
