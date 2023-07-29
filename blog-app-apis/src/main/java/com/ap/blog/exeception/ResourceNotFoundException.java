package com.ap.blog.exeception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class ResourceNotFoundException extends RuntimeException{
	
	String resorceName;
	String fieldName;
	long fieldValue;
	
	public ResourceNotFoundException(String resorceName, String fieldName, long fieldValue) {
		super(String .format("%s not found with %s : %s",resorceName ,fieldName, fieldValue));
		this.resorceName = resorceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
}
