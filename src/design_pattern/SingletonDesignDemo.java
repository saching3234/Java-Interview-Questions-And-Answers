package design_pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDesignDemo {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		sirializabeldDemo();
		reflectionDemo();
	}



static void sirializabeldDemo() throws FileNotFoundException, IOException, ClassNotFoundException {
	LazySingleTon singleTon=LazySingleTon.getInstance();
	//take the output stream for objct writing in file
	ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("object.txt"));
	objectOutputStream.writeObject(singleTon);
	objectOutputStream.close();
	//read object from file
	ObjectInputStream objectInputputStream=new ObjectInputStream(new FileInputStream("object.txt"));	
	LazySingleTon singleTon1=(LazySingleTon) objectInputputStream.readObject();
	objectInputputStream.close();
	
	System.out.println(singleTon.hashCode());
	System.out.println(singleTon1.hashCode());	
    System.out.println(singleTon==singleTon1);
  }


static void reflectionDemo() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
	Constructor constructors[]=LazySingleTon.class.getDeclaredConstructors();
	Constructor constructor=constructors[0];
	constructor.setAccessible(true);
	LazySingleTon singleTon=(LazySingleTon) constructor.newInstance();
    LazySingleTon instance=singleTon.getInstance();

    System.out.println("Reflected hashcode singleton: "+singleTon.hashCode());
    System.out.println("single ton instance :"+instance.hashCode());
    
    
}


}
