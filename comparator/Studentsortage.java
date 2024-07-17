package com.java.symboisis.comparator;

import java.util.Comparator;

public class Studentsortage implements Comparator<Student>{

	@Override
	public int compare(Student x, Student y) {
		// TODO Auto-generated method stub
		return x.age-y.age;
	}

}
