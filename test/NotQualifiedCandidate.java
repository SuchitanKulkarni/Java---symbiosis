package com.java.symboisis.test;

public class NotQualifiedCandidate extends RuntimeException {
	
	@Override
	
	public String getMessage() {
		return "\n Your are not Qualified for this Position";
		
	}

}
