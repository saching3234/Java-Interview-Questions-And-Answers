package mypackage;



public class MyException extends Exception {

	public MyException() {
		super("Exception is occurred");
	}

	void display(int i) throws MyException {
		if (i > 0)
			throw new MyException();
		else
			System.out.println("The value of i is " + i);
	}

	public static void main(String[] args) {
		MyException exception = new MyException();
		try {
			exception.display(1);
		} catch (MyException e) {

			System.out.println(e.getMessage());
		}
	}

}
