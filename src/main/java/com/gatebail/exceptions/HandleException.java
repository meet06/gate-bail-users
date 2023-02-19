package com.gatebail.exceptions;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandleException {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Map<String,String>> globalExeption(Exception e){
		return ResponseEntity.ok(Map.of("error",e.getMessage()));
	}
}
