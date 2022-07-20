package accessmodifier;

public class TestMethods {
	
	public static void main(String [] args) {
		
		Accessmodifier obj= new  Accessmodifier();
				
				obj.methodDefault();
				//obj.methodPrivate(); private method we can't access out side of class, its scope is within the class
				obj.methodProtected();
				obj.methodPublic();
			}
}


