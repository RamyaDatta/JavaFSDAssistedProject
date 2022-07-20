package accessmodifieranother;

import accessmodifier.Accessmodifier;


public class TestaccessInanotherPackage {
	
public static void main(String [] args) {
		
		Accessmodifier obj= new  Accessmodifier();
		
		
		///public method is a globally accessible to all classes and packages
		//obj.methodDefault();
		//obj.methodPrivate();
		//obj.methodProtected();
		obj.methodPublic();
		
		
		
	}


}
