package com.ap.blog.services;

import java.util.List;

import com.ap.blog.payloads.PostDto;
import com.ap.blog.payloads.PostResponse;

public interface PostService {

	// Create

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// update

	PostDto updatePost(PostDto postDto, Integer postId);

	// Delete

	void deletePost(Integer postId);

	// Get All Post

	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

	// Get Single Post

	PostDto getPostById(Integer postId);

	// get All post by category

	List<PostDto> getPostByCategory(Integer categoryId);

	// Get All Post By User

	List<PostDto> getPostByUser(Integer userId);

	// Search Post

	List<PostDto> searchPosts(String keyword);

}
