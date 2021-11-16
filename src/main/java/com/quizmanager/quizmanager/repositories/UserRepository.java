package com.quizmanager.quizmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizmanager.quizmanager.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUserName(String userName);
	
}
