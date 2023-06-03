package mypackage;

public class ExceptionDemo {
	
	@SuppressWarnings("finally")
	static int m1() {
		try {
			System.out.println(10/0);
			return 1;
		
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return 2;
		}finally {
			System.out.println("Finally block");
		   //return 3;	
		}
	}
	
	public static void main(String[] args) {
		System.out.println(m1());
	}

}
