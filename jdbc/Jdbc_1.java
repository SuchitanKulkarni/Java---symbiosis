package com.java.symboisis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc_1 {
	
	public String nameString;
	public String designString;
	public String cityString;
	public double salary;
	
	void data() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n enter the name : ");	
		nameString = sc.next();
		
		System.out.println("\n enter the designation : ");
		designString = sc.next();
		
		System.out.println("\n enter the city : ");
		cityString = sc.next();
		
		System.out.println("\n enter the salary : ");
		salary = sc.nextDouble();
	}
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {

	
		// TODO Auto-generated method stub
	
	Jdbc_1 j = new Jdbc_1();
	j.data();
		Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println("hii");
//		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Such@123");
	
	//PreparedStatement p = con.prepareStatement("insert into emp (name,designation,salary ,city)values('"+j.nameString+"','"+j.designString+"','"+j.salary+"','"+j.cityString+"')");
	
	PreparedStatement p = con.prepareStatement("insert into emp (name,designation,salary ,city) values (?,?,?,?)");
	
	p.setString(1,j.nameString);		//positional data inserting
	p.setString(2,j.designString);
	p.setDouble(3,j.salary);
	p.setString(4,j.cityString);
	
	
	int i = p.executeUpdate();
	
	if(i>0) {
		
		System.out.println("Data inserted");
	}
	else {
		
		System.out.println("Error");
	}
		
	
	
}

}
