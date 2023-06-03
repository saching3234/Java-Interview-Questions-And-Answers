package oop;

public class Child extends Parent {
	
	public void m1() {
		System.out.println("Method in the child is called");
	}
	
	public static void main(String[] args) {
		Parent parent=new Parent();
		parent.m1();		
	}

}
