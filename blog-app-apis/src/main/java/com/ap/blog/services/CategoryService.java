package com.ap.blog.services;

import java.util.List;

import com.ap.blog.payloads.CategoryDto;

public interface CategoryService {
	
	// Create
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	// Update
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	// Delete
	public void deleteCategory(Integer categoryId);
	
	//Get
	public CategoryDto getCategory(Integer categoryId);
	
	// Get All
	List<CategoryDto> getCategories();

}
