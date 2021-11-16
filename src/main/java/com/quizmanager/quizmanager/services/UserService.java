package com.quizmanager.quizmanager.services;

import java.util.Set;

import com.quizmanager.quizmanager.models.User;
import com.quizmanager.quizmanager.models.UserRole;

public interface UserService {
	//Create new user
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	//Get user by username
	public User getUserName(String userName);
	
	//Delete user by id
	public void deleteUser(Long userId);

}
