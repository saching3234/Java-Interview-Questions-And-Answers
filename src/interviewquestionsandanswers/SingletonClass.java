package interviewquestionsandanswers;

import java.io.Serializable;

class SingletonDemo implements Serializable {
	private static SingletonDemo instance;

	// make the private constructor
	private SingletonDemo() { }

	// make one public static method who can return the instance of the class
	public static SingletonDemo getInstance() {

		// check if the instance available or not if not available create new one
		if (instance == null) {
			// make the synchronised block
			synchronized (SingletonDemo.class) {
				// double check the instance available or not if not available create new one
				if (instance == null)
					instance = new SingletonDemo();
			}
		}
		// return the instance
		return instance;
	}
	// method automatically called by the jvm while serialling and deserialising
	// to prevent breaking in the serializing and deserialising readResolve method
	// is called automatically
	protected Object readResolve() {
		return instance;
	}
}

public class SingletonClass {

	 public static void main(String[] args) {
		SingletonDemo demo=SingletonDemo.getInstance();
		SingletonDemo demo2=SingletonDemo.getInstance();
		System.out.println(demo==demo2);
	}
	
}
