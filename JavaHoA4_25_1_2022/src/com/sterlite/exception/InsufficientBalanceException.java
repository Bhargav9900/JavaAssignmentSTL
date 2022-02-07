/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Insufficient Balance Exception class
 */
package com.sterlite.exception;

public class InsufficientBalanceException extends Exception {

	private static final long serialVersionUID = 1L;
	private String errorMessage;
	
	public InsufficientBalanceException() {
		errorMessage = "Balance is not sufficient";
	}

	public InsufficientBalanceException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "InsufficientBalanceException [errorMessage=" + errorMessage + "]";
	}

//	@Override
//	public String toString() {
//		return "errorMessage=" + errorMessage;
//	}
	
	
	

}
