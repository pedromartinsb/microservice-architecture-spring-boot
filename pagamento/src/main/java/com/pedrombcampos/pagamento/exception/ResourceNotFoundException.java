package com.pedrombcampos.pagamento.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1687250710146527883L;
	
	public ResourceNotFoundException(String exception) {
		super(exception);
	}

}

