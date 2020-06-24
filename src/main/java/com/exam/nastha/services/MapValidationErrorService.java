package com.exam.nastha.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@Service
public class MapValidationErrorService {
	
	public  ResponseEntity<?> MapValidationService(BindingResult result){
		if(result.hasErrors()) {
			Map<String,String> pesanMap=new HashMap<>();
			
			for(FieldError error:result.getFieldErrors()) {
				pesanMap.put(error.getField(),error.getDefaultMessage());
			}
			
			return new ResponseEntity<Map<String,String>>(pesanMap, HttpStatus.BAD_REQUEST);
			
		}
		return null;
	}//respEnt

}
