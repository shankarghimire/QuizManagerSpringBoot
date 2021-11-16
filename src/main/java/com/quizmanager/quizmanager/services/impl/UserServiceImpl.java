package com.quizmanager.quizmanager.services.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizmanager.quizmanager.models.User;
import com.quizmanager.quizmanager.models.UserRole;
import com.quizmanager.quizmanager.repositories.RoleRepository;
import com.quizmanager.quizmanager.repositories.UserRepository;
import com.quizmanager.quizmanager.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User tempUser = this.userRepository.findByUserName(user.getUserName());
		if(tempUser != null) {
			System.out.println("User already exist!");
			throw new Exception("User already exist!");
		}
		else {
			
			for(var userRole: userRoles) {
				this.roleRepository.save(userRole.getRole());
			}
			
			user.getUserRoles().addAll(userRoles);
			tempUser = this.userRepository.save(user);
			
		}
		return tempUser;
	}

	//Getting user by userName
	@Override
	public User getUserName(String userName) {
		return this.userRepository.findByUserName(userName);
	}

	@Override
	public void deleteUser(Long userId) {
		this.userRepository.deleteById(userId);
		
	}

}
