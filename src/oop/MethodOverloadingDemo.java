package oop;

public class MethodOverloadingDemo {

	static void m1(String a) {
		System.out.println("The String method called");
	}
	
	static void m1(StringBuffer sb) {
		System.out.println("The String buffer method called");
	}
	
	static void m2(int n) {
		System.out.println("The ineteger method is called");
	}
	
	static void m2(int ...n) {
		System.out.println("Var argument method called");
	}
	
	public static void main(String[] args) {
		m1("Sachin");		
	    //as both the method arguments are at the same level so it will confuse to which method should be called
		//m1(null);
		m2();
		m2(1);
		m2(1,2,3);		
	}
}
