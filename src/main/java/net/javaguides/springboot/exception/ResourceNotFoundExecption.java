package net.javaguides.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExecption extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExecption(String message) {
		super(message);
		
	}
	
}
