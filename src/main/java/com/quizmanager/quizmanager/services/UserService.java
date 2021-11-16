package com.quizmanager.quizmanager.services;

import java.util.Set;

import com.quizmanager.quizmanager.models.User;
import com.quizmanager.quizmanager.models.UserRole;

public interface UserService {
	//Create new user
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	//Get user by username
	User getUserName(String userName);
	
	//Get User by user Id
	User getUserById(long id);
	
	//Delete user by id
	void deleteUser(Long userId);
	
	//Update User by Id
	User updateUser(User user, long id);

}
