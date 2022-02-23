package com.training.model.service;

import java.util.Optional;

import com.training.model.persistance.User;

public interface UserService {
	public void addUser(User user);
	public Optional<User> getUser(String username, String password);

}
