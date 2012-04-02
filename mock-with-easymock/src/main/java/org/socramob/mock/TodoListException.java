package org.socramob.mock;

public class TodoListException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public TodoListException(String message, Exception cause) {
		super(message, cause);
	}

}
