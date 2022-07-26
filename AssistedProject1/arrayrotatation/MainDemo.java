package simplilearn.arrayrotatation;

public class MainDemo {
	
public static void main(String[] args) {
		
		ArrayRotationDemo r= new ArrayRotationDemo();
		
		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		
		
		r.rotate(arr, 12); ///passing array and number of  times to  rotate an array
		
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
