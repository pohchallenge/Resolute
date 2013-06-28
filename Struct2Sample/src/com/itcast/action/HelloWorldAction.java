package com.itcast.action;

/**
 * This is a simple action class
 * @author thomas
 *
 */
public class HelloWorldAction {

	private String message;
	

	public String execute(){
		
		message = "this is the sample struct2";
		return "success";
		
	}


	public String getMessage() {
		return message;
	}

}
