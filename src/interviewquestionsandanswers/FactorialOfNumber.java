package interviewquestionsandanswers;

public class FactorialOfNumber {
	
	public static void main(String[] args) {
		System.out.println("The factorial of 5 using the normal method is :"+factorialByNormalMethod(4));

		//System.out.println("The factorial of 5 using the recursion method is :"+factorialByRecursion(4));
	}
	
	
	static int factorialByRecursion(int n) {
		
		//termination condition when n becomes 1 return 1
		if(n==1)
			return 1;
		else {
		 return	 (n*factorialByNormalMethod(n-1));
		}
		
	}
	
	static int factorialByNormalMethod(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		
		return fact;
	}

}
