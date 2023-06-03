package mypackage;

public class FinaliseMethodDemo {

	@Override
	public void finalize() {
		System.out.println("The finalize method is called");
	}

	/*
	 * public static void main(String[] args) { FinaliseMethodDemo demo = new
	 * FinaliseMethodDemo(); demo = null; System.gc();
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		try {
			System.out.println("try block");
		} finally {
	     System.out.println("Finally called");
		}
	}
	
	
	

}
