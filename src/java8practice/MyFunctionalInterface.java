package java8practice;

//@FunctionalInterface
class MyInter{
	void show() {}
	
	 void defaultMethod() {
		System.out.println("default method from the functional interface");
	}
	
	static void staticMethod() {
		System.out.println("Static method of functional interface");
	}
}
public class MyFunctionalInterface extends MyInter{

	@Override
	public void show() {
        System.out.println("Show method @Overrided ");		
	}
	
	static void staticMethod() {
		MyInter.staticMethod();
		System.out.println("Static method of child class");
	}
	
	
	
	public static void main(String[] args) {
	   MyFunctionalInterface myFunctionalInterface=new MyFunctionalInterface();
	   myFunctionalInterface.show();
	   myFunctionalInterface.defaultMethod();
	   myFunctionalInterface.staticMethod();
	}
}
