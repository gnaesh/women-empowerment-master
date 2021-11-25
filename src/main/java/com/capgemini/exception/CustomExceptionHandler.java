package com.capgemini.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);

	@ExceptionHandler(NGONotFoundException.class)
	public ResponseEntity<Object> handleNGONotFoundException() {
		LOG.error("handleNGONotFoundException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This NGO is NOT available in the database.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoSuchNgoException.class)
	public ResponseEntity<Object> handleNoSuchNgoException() {
		LOG.error("handleNoSuchNgoException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "NO Such NGO available in the database.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidNgoException.class)
	public ResponseEntity<Object> handleInvalidNgoException() {
		LOG.error("handleNoSuchNgoException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Name must contain only alphabets.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}
	
	

	@ExceptionHandler(NotvalidTypeException.class)
	public ResponseEntity<Object> handleNotvalidTypeException() {
		LOG.error("handleNoSuchNgoException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "NGO Type must contain only alphabets.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}
	

	@ExceptionHandler(NotvalidMotiveException.class)
	public ResponseEntity<Object> handleNotvalidMotiveException() {
		LOG.error("handleNotvalidMotiveException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "NGO Motive must contain only alphabets.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(NotvalidLocationException.class)
	public ResponseEntity<Object> handleNotvalidLocationException() {
		LOG.error("handleNotvalidMotiveException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "NGO Location must contain only alphabets.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(NotvalidActivitesException.class)
	public ResponseEntity<Object> handleNotvalidActivitesException() {
		LOG.error("handleNotvalidMotiveException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "NGO Activites must contain only alphabets.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NGOAlreadyExistException.class)
	public ResponseEntity<Object> handleNGOAlreadyExistException() {
		LOG.error("handleNotvalidMotiveException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "NGO Already in database with that NGOID.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}
	

	@ExceptionHandler(NoNgoPresentByMotiveException.class)
	public ResponseEntity<Object> handleNoNgoPresentByMotiveException() {
		LOG.error("handleNotvalidMotiveException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "NGO is not present database with that Motive.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoNgoPresentByLocationException.class)
	public ResponseEntity<Object> handleNoNgoPresentByLocationException() {
		LOG.error("handleNotvalidMotiveException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "NGO is not present database with that Location.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}
	
	
	
	
	
}