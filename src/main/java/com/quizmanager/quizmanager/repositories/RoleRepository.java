package com.quizmanager.quizmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizmanager.quizmanager.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
