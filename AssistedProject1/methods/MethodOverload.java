package com.simplilearn.methods;

public class MethodOverload {
	
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b,int c) {
		return a+b+c;
	}
	float add(float a, float b) {
		return a+b;
	}
	
	double add(double a, double b) {
		return a+b;
	}
	
	 
	
	public static void main(String[] args) {
		MethodOverload obj= new MethodOverload();
		
		System.out.println("Addition of 23 and 4 :"+obj.add(29, 10));
		System.out.println("Addition of 23.0 and 9.78 :"+obj.add(32.0f,49.78f));
		System.out.println("Addition of 2 double :"+obj.add(7.8, 9.6));
		System.out.println("Addition of 3 int: "+obj.add(9, 8, 7));
		
	}

}
