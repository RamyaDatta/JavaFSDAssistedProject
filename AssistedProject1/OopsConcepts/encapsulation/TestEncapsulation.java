package simplilearn.encapsulation;



public class TestEncapsulation {
	public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
        obj.setName("Harish"); 
        obj.setAge(21); 
        obj.setRoll(235676); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      
    } 


}
