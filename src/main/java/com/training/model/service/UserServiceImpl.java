package com.training.model.service;

import java.util.Optional;

import com.training.model.persistance.User;
import com.training.model.persistance.UserDao;
import com.training.model.persistance.UserDaoImpl;

public class UserServiceImpl implements UserService{

	public UserDao userDao=null;
	public UserServiceImpl()
	{
		userDao=new UserDaoImpl();
	}
	@Override
	public void addUser(User user) {
	
		userDao.addUser(user);
	}

	@Override
	public Optional<User> getUser(String username, String password) {
		// TODO Auto-generated method stub
		return userDao.getUser(username, password);
	}

}
