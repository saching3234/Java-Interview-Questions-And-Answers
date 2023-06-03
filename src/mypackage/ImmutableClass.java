package mypackage;

final class MyClass{
   private final int value;
   
   //setting the value in the constructor
   public MyClass(int value) {
	   this.value=value;
   }
   
   //make the public constructor
   public int getValue() {
	   return value;
   }
   
}

public class ImmutableClass {

	public static void main(String[] args) {	
	MyClass myClass=new MyClass(23);	
	System.out.println(23);
   }
}
