package mypackage;


 class MyAbstract{
	void m1() {
		System.out.println("The m1 method called in the abstract class");
	}
	
	void m2() {
		System.out.println("The m2 method called in abstract class");
	}
	
}

public class AbstractClassDemo extends MyAbstract{
	void m1() {
		System.out.println("The m1 method called in the child class");
	}
	
	void m2() {
		System.out.println("The m2 method called in child class");
	}
	
	void m3() {
		System.out.println("The m3 method called in child class");
	}	
	
	public static void main(String[] args) {
		
		AbstractClassDemo child=new AbstractClassDemo();
		child.m1();
		child.m2();
		child.m3();
		
		MyAbstract parentAbstract =new AbstractClassDemo();
		parentAbstract.m1();
		parentAbstract.m2();
		
	}

}
