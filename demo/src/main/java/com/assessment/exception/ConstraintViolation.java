/**
 * 
 */
package com.assessment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Prabal
 *
 */
@ResponseStatus(value = HttpStatus.CONFLICT)
public class ConstraintViolation extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConstraintViolation(String exception) {
	    super(exception);
	  }
}
