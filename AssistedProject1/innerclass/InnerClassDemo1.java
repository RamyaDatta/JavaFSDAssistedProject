package com.simplilearn.innerclass;

public class InnerClassDemo1 {
	
	private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello()
	     {
		  System.out.println(msg+", Let's understand Inner Classes");
		  }  
	 }  


	public static void main(String[] args) {

		InnerClassDemo1 obj=new InnerClassDemo1();
		InnerClassDemo1.Inner in=obj.new Inner();  
		in.hello();  
	}
}



