package mypackage;

import java.util.ArrayList;


class X{
	X(){
		System.out.println("A class constructor is  called");
	}
	
	void m1(){
		System.out.println("Parent class method");
	}
}

class Y extends X{
	
	Y(){
	 System.out.println("The B class constructor is called");
	}
	
	void m1() {
		System.out.println("child class");
	}
	
	void m2() {
		super.m1();
	}
}


public class ParentChildClassScenario {

	public static void main(String[] args) {
		Y y=new Y();	
		y.m2();		
		ArrayList arrayList=new ArrayList<>();
		System.out.println();
		
	}
}
