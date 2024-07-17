package com.java.symboisis.test;

public class OddNumberException extends RuntimeException  {
		
	@Override
	 public String getMessage() {
	       String string = " Odd Number is caught";
	       return string;
	    }

}
