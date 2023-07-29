package com.ap.blog.payloads;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.ap.blog.entities.Comment;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class PostDto {
	
	private Integer postId;
	private String title;
	
	private String content;
	
	private String imageName;

	private Date addedDate;
	
	private CategoryDto category;

	private UserDto user;
	
	private Set<CommentDto> comments = new HashSet<>();
	

}
