package com.khoahd1.controller;

import java.net.BindException;

import javax.validation.ValidationException;

import org.hibernate.exception.JDBCConnectionException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	
	@ExceptionHandler(value = {Exception.class, JDBCConnectionException.class, MethodArgumentNotValidException.class,
			BindException.class,ValidationException.class})
	public String exceptionHandle(Exception exception) {
		return "error";
	}
}
