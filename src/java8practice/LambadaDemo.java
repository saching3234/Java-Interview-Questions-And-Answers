package java8practice;

@FunctionalInterface
interface MyInterface{
	//void m1();
	int m2(int a,int b);
}


public class LambadaDemo {

	public static void main(String[] args) {
		MyInterface m=(a,b)->{
			return a+b;
		};
		
		MyInterface m2=(a,b)->a+b;
		
		MyInterface m3=(a,b)->{
			if(a<b)
				throw new RuntimeException("The value of a should be greater then b");
				else
					return a+b;
		};
		
		
		
		System.out.println(m.m2(10,20));
		System.out.println(m2.m2(12, 30));
		
		System.out.println(m3.m2(10, 30));
	}
	
	
}
