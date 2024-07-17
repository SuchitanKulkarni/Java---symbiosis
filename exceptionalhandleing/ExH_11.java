package com.java.symboisis.exceptionalhandleing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExH_11 {
	
	public static void main(String[] args) {
		
		try {
			FileReader f= new FileReader("java.exe");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	// here the full information about the exceprtion is provided as the file java is not inbuilt
		}
	}

}
