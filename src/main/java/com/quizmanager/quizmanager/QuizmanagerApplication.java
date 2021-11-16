package com.quizmanager.quizmanager;



import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.hibernate.dialect.MySQL8Dialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.quizmanager.quizmanager.models.Role;
import com.quizmanager.quizmanager.models.User;
import com.quizmanager.quizmanager.models.UserRole;
import com.quizmanager.quizmanager.services.UserService;

@SpringBootApplication
public class QuizmanagerApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(QuizmanagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code: ");
		
//		User user = new User();
//		user.setFirstName("Sam");
//		user.setLastName("Ghimire");
//		user.setUserName("sam123");
//		user.setPassword("abc");
//		user.setEmail("sam@gmail.com");
//		user.setProfile("default.png");
//		
//		Role role1 = new Role();
//		role1.setRoleName("ADMIN");
//		
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole  = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println("user: " + user1.getUserName());
//		
		
	}

}
