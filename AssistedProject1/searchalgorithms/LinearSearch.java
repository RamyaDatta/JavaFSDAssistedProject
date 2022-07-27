package simplilearn.searchalgorithms;

import java.util.Scanner;  // Import the Scanner class


public class LinearSearch {
	
	//from Nikunj (Trainer) to All Participants:
		public static void main(String[] args) {
		        
		        int  [] arr= {25,19,32,56,33};
		        
		        Scanner sc= new Scanner(System.in);
		        System.out.println("Enter the Element to  be Searced");
		        
		        int SearchValue= sc.nextInt();
		        
		        int result= linearing(arr,SearchValue);
		        
		        if(result==-1) {
		            System.out.println("Element Not Found In The Array");
		        }
		        else {
		            System.out.println("Element Found at index: ["+result+"]  and Search  key is :"+arr[result]);
		        }
		        
		    }
		    
		    private static int linearing(int[] arr,int searchValue) {
		        
		                 
		        for(int i=0; i<arr.length; i++) {
		            
		            if(arr[i]==searchValue) {
		                return i;
		            }
		            
		        }
		        return -1;
		    }


}
