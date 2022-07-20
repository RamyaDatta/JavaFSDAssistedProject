package simplilearn.typecasting;
public class TypeCasting {
	
	public static void main(String [] args) {
		
		//Implicit Type Casting
		System.out.println("Implicit Type Casting - ");
		byte a=10;
		System.out.println("Byte: "+a);
		short b=a;
		System.out.println("Byte to Short Conversion: "+b);
		int c =b;
		System.out.println("Short to Int Conversion: "+c);
		int d=a;
		System.out.println("Byte to Int Conversion: "+d);
		float e=d;
		System.out.println("Int to Float Conversion: "+e);
		double f=e;
		System.out.println("Float to double Conversion: "+f);
		double g=d;
		System.out.println("Int to double Conversion: "+g);
		System.out.println("Explicit Type Casting - ");
		//Explicit Type Casting
		double ab= 23.67;
		int ba=(int) ab;  ///convert forcefully to integer
        long l = (long)ba;

		System.out.println("Converted Forcefully Double "+ab+" to int "+ba);
		System.out.println("Converted Forcefully Int "+ba+" to long "+l);

		
		
		
	}
	

}
