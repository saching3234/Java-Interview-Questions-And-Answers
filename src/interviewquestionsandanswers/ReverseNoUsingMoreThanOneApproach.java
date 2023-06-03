package interviewquestionsandanswers;

public class ReverseNoUsingMoreThanOneApproach {	
	public static void main(String[] args) {
		int n=1234;
		int rev=0;
		//first approach by converting the int into the string and reversing it
		StringBuffer sb=new StringBuffer(String.valueOf(n));
		System.out.println("Reversing of no using string buffer :"+Integer.valueOf(sb.reverse().toString()));
	    String string;
		//using the traditional approach
		while(n!=0) {
			int rem=n%10;
		    rev=rev*10+rem;
		    n=n/10;
		}		
		System.out.println("Second approach :"+rev);		
	}
}
