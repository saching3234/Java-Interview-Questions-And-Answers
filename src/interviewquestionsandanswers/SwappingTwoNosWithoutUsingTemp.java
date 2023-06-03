package interviewquestionsandanswers;

public class SwappingTwoNosWithoutUsingTemp {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//approach 1 using the temp		
		int temp=a;
		a=b;
		b=temp;		
		System.out.println("Approach using temp");
		System.out.println("a= "+a+" b="+b);
		 a=10;
		 b=20;
		 //without using the temp use addition and subtraction approach
		 a+=b;
		 b=a-b;
		 a=a-b;
		 System.out.println("Second approach a: "+a+" b: "+b);
		 a=10;
		 b=20;
		 //third approach using xor 
		 a=a^b;
		 b=a^b;
		 a=a^b;
		 System.out.println("Third approach a: "+a+" b: "+b);
		
		 
	}

}
