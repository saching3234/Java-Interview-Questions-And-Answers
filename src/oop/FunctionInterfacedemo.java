package oop;

import java.util.Comparator;

@FunctionalInterface
interface MyFunctionalInterface {
	int m1(int a,int b);

	default void d1() {
		System.out.println("Default method 1 ");
	}

	default void d2() {
		System.out.println("Default method 2 ");
	}

	static void s1() {
		System.out.println("static  method 1 ");
	}

	static void s2() {
		System.out.println("static  method 2 ");
	}

}

@FunctionalInterface
interface MyFunInter{
	//int sum(int a, int b);
	int sub(int a,int b);
}




public class FunctionInterfacedemo {

	public static void main(String[] args) {
		/*
		 * MyFunctionalInterface m = () -> System.out.println("Lambada methodnbody");
		 * m.m1(); m.d1(); m.d2(); MyFunctionalInterface.s1();
		 * MyFunctionalInterface.s2();
		 */
		
		MyFunctionalInterface m=(a,b)->{
			
			if(a<b)
				throw new RuntimeException("the value of a should be greater than b");
			else
				return a-b;		
		};
		
		//System.out.println("The sum of 5 and 10 is : "+m.sum(5, 10));
		
		System.out.println("The subtraction of 10 and 7 is :"+m.m1(10, 7));
		m.d1();
     System.out.println(m.toString());
		
	}
}
