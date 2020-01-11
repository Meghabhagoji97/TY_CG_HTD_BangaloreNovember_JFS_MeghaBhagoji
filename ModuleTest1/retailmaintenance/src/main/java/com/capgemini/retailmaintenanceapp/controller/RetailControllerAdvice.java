package com.capgemini.retailmaintenanceapp.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailmaintenanceapp.dto.RetailResponse;
import com.capgemini.retailmaintenanceapp.exception.ProductCustomException;

@RestControllerAdvice
public class RetailControllerAdvice {
	
	@ExceptionHandler(ProductCustomException.class)
	public RetailResponse handleEmployeeException(ProductCustomException e)
	{
		RetailResponse response = new RetailResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
		
	}
}
