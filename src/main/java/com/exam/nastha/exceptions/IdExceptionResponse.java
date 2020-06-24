package com.exam.nastha.exceptions;

public class IdExceptionResponse {
	
	private String id;
	
	
	//construct
	public IdExceptionResponse(String string) {
		this.id =string;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}



}
