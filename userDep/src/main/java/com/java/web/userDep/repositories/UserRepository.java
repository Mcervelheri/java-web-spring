package com.java.web.userDep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.web.userDep.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
