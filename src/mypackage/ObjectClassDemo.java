package mypackage;

interface Myter{
	
}

public class ObjectClassDemo implements Cloneable ,Myter{
	
	String nameString="sachin";
	int age=20;

	  protected void finalize() throws Throwable {
		    // Cleanup code
		    System.out.println("Finalizing Example object");
		  }
		
	
	public static void main(String[] args) throws CloneNotSupportedException {
	   Myter obj=new ObjectClassDemo();
	   //ObjectClassDemo obj2=(ObjectClassDemo) obj.clone();
	  System.out.println(obj.toString());
	  System.out.println(obj.hashCode());
	  //System.out.println(obj.equals(obj2));      
	  System.out.println(obj.getClass());
	}

}
