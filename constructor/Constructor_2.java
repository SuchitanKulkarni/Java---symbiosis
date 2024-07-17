package com.java.symboisis.constructor;

public class Constructor_2 {
	
	String nameString;
	int Id;
	float salary;
	String desigString;
	String companyString;
	int Packegage ;
	
	public Constructor_2(int id,String ename,float salary,String deString) {
		
		this.nameString = ename;
		this.Id = id;
		this.salary = salary;
		this.desigString = deString;
		
		System.out.println("\nname : "+nameString + "\n Id : " + Id +"\n Salary : " + salary+"\n Designation : " + deString);
		
		
	}
	
    public Constructor_2(String companyString, int Packegage ) {
		
    	this.companyString = companyString;
    	this.Packegage = Packegage;
		
		System.out.println(" Company : " + companyString + "\n package : " + Packegage);
		
		
	}
	
	public static void main(String[] args) {
		
		
	    new Constructor_2(101,"Suchita", 23970, "SWD");
		new Constructor_2("Amdos", 800000);
		 new Constructor_2(102,"Anvee", 300700, "Analyst");
		 new Constructor_2("TCS", 900000);
		 new Constructor_2(103,"kaveri", 180070, "SWD");
		 new Constructor_2("Tata Mahindra", 1000000);
		 new Constructor_2(104,"Swati", 150070, "SWD");
		 new Constructor_2("Google", 1000000);
		
	}

}
