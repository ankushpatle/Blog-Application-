package com.ap.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ap.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
