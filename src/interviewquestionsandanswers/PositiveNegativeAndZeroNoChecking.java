package interviewquestionsandanswers;

import java.util.Scanner;

public class PositiveNegativeAndZeroNoChecking {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no :");
		int n=scanner.nextInt();
		
		if (n>0)
		System.out.println("No is positive no");
		else if(n<0)
			System.out.println("No is negative no ");
		else
			System.out.println("No is zero");	
	}

}
