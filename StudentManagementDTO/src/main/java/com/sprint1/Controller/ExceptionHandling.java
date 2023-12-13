package com.sprint1.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

public class ExceptionHandling  extends ResponseEntityExceptionHandler {
	
	
		protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex ,
			HttpHeaders headers ,HttpStatus status , WebRequest request){
		
//		name:"IT SHOULD WITHIN 100 CHARATERS"
		
		Map<String , String> errors = new HashMap<>();
//		getBindingResult() : to bind all the exception
//		getAllErrors() : to get all the error in the list
		ex.getBindingResult().getAllErrors().forEach((error)->{
			
//			getField() :it returns the affected field that have the error it returns 
//			the field error object that why we needs to typecast it
			
			String fieldName = ((FieldError)error).getField(); 
			String message = error.getDefaultMessage(); // error is a  by default object
			
			errors.put(fieldName,message);
			
		});
		
		
		return new ResponseEntity<Object>(errors,HttpStatus.BAD_REQUEST);

}
}
