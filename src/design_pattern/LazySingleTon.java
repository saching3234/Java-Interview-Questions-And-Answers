package design_pattern;

import java.io.Serializable;

public class LazySingleTon implements Serializable{
    //private member that will hold the instace of the class
	private  static LazySingleTon lazySingleTon;
	
	//private constructor
	private LazySingleTon() {}
	
	public static final  LazySingleTon getInstance() {
		if(lazySingleTon==null) {
			synchronized (LazySingleTon.class){
				if(lazySingleTon==null)
					lazySingleTon= new LazySingleTon();
			}
		}
			return lazySingleTon;
	}
	
	
	//method automatically called by the jvm while serialling and deserialising
	protected Object readResolve() {
		return lazySingleTon;
	}
}
