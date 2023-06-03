package interviewquestionsandanswers;

@FunctionalInterface
interface MyInterf{
	
	void m1();
}



public class LambadaDemo {
   
	public static void main(String[] args) {
		//tradtional way of anonymous function
		MyInterf myInterf=new MyInterf() {
			
			@Override
			public void m1() {
				System.out.println("Anonymous implementation ");
				
			}
		};
		
	 myInterf.m1();	
		//lambada way 
		MyInterf myInterf1=()->System.out.println("called the lambada implemented method here ");
		
		myInterf1.m1();
	}
}
