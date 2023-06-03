package interviewquestionsandanswers;

public class PrimeNoChecking {		
	
	public static void main(String[] args) {
		
		for(int i=2;i<=100;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				//check the no is divisible by 2 to i-1 if yes then no is not the prime no come out of a loop
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			
			if(isPrime)
				System.out.print(i+" ");
		}	
		
		
		System.out.println("prime no checking : ");
		
		if(primeCheck(1))
			System.out.println("No is prime no ");
		else
			System.out.println("No Is not prime no");
	     
		
	}
	
	
	static boolean primeCheck(int n) {
		if(n<2)
			return false;
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) 
					return false;
				
			}			
		}
		
		return true;
	}
	
}
