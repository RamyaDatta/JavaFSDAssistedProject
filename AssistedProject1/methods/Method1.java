package com.simplilearn.methods;

public class Method1 {
	public void print() {
		System.out.println("Method without return type and without parameter");
	}
	
	//method returning nothing with 1 parameter
	public void display(String name) {
		
		System.out.println("My name is "+name);
	}
	
	
	//method with return type and parameter
	public int cube(int n) {
		
		return n*n*n;
	}
	//method return string with two parameters
	public String fullName(String fname, String lname) {
		return fname+" "+lname;
	}
	
	public static void main(String[] args) {
		
		Method1 obj= new Method1();
		obj.print();
		obj.display("Simplilearn");
		
		int cube=obj.cube(6);
		System.out.println("Cube of 6 is: "+cube);
		
		String MyName=obj.fullName("Ramya", "Datta");
		System.out.println("My Name is: "+MyName);
		
		
	}

}
