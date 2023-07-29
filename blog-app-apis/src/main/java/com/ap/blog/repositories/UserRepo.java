package com.ap.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ap.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
