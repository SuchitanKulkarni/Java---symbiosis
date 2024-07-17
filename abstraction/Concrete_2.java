package com.java.symboisis.abstraction;

public class Concrete_2 extends Abstract_2 {
	
	int array[]=new int[10];

	@Override
	void fill() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<3;i++) {
			int p = get();
			array[i] = p;
		}
	}
	
	public static void main(String[] args) {
		
		Concrete_2 c = new Concrete_2();
		
		c.fill();
	}

}
