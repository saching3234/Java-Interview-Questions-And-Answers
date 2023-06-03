package oop;

public class Parent {

	public  void m1() {
		System.out.println("Parent method called");		
	}
	
	static void m3() {
		System.out.println("M3 method called");
	}
	
	static int m2() {
		return 1;
	}
	
	public static void main(String[] args) {
	  	m3();
	  	System.out.println(m2());
		
	}

}
