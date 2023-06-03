package real_time_interview_questions_answers;

//1.write simple private show message method
//2. write program for singleton design pattern
//3. write a program to show the diamond access problem solution in the interfaces default method implementation

interface Iterface1{
	default void m1() {
		System.out.println("The default method m1 of interface1 called");
	}
}


interface Interface2{
	default void m1() {
		System.out.println("The default method m1 of interface2 called");
	}
}

public class Oktalsydac implements Iterface1,Interface2 {	
   private	static Oktalsydac demo;	
       private Oktalsydac() {}
       
      static public Oktalsydac  getInstance(){    	  
    	  if(demo==null) {
    	  synchronized(Oktalsydac.class){    	  
    	  if(demo==null)
    	    {
    		  
    	    	demo=new Oktalsydac();
    	    }    	     	  
    	  } 
    	 } 
    	  
    	  return demo; 
      }	
	
      //private method
      private void showMessage() {
    	  System.out.println("Hello from show message method");
      }
      
	@Override
	public void m1() {
		//calling the same method using the interface name , super and method name
		Iterface1.super.m1();
		Interface2.super.m1();
	}

	public static void main(String[] args) {		
		Oktalsydac d1=Oktalsydac.getInstance();
		Oktalsydac d2=Oktalsydac.getInstance();		
		System.out.println(d1.equals(d2));		
		System.out.println(d2==d1);
		d2.showMessage();
		d2.m1();
	}
}
