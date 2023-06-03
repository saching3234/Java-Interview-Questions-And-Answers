package java8practice;

import java.net.DatagramSocket;


interface MyFunInterFace{
	//void m1();
	//void m3();
	default void defaultMethod() {
		System.out.println("Default method");
	}
	
	default void defaultMethod2() {
		System.out.println("Default method2");
	}
	static void m2() {
		System.out.println("static m2 method");
	}
}


public class FunctionalInterfaceDemo implements MyFunInterFace{	
	public static void main(String[] args) {	
		MyFunInterFace ms=new FunctionalInterfaceDemo();
	//ms.m1();
	ms.defaultMethod();
	ms.defaultMethod2();
	MyFunInterFace.m2();
	}

	//@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
 
}
