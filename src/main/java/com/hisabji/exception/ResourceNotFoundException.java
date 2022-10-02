/**
 * 
 */
package com.hisabji.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author subhash
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{

	private static final long serialVersionUID = -5890538320670225124L;

	public ResourceNotFoundException(String message, long id){
    	super(message);
	}
}
