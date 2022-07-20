package com.simplilearn.innerclass;

public class InnerClassDemo2 {
	private String msg="Inner Classes Demo2";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		InnerClassDemo2  ob=new InnerClassDemo2 ();  
		ob.display();  
		}
	 


}
