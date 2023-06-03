package interviewquestionsandanswers;

public class PalindromeNo {
	
	public static void main(String[] args) {
		//		palindrome no is the one whose is same when we reverse it
		
		int n=1221,revNo=0;
		int temp=n,rem;
		
		while(temp>0) {
			//get the last digit of the no use %10
			rem=temp%10;
			//add the no to the end of reversed no
			revNo=(revNo*10)+rem;
			//remove the last no from the original no use /10'
			temp=temp/10;			
		}
		
		System.out.println(revNo);
		//check if the reversed no is eqaul to given no or not
		if(revNo==n)
			System.out.println("The no:  "+n+" is a palindrome no:");
		else
			System.out.println("The no is not a palindrome no");
	}

}
