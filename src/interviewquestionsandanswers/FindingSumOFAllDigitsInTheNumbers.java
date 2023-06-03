package interviewquestionsandanswers;

import java.util.Scanner;

public class FindingSumOFAllDigitsInTheNumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner( System.in);
		System.out.println("Enter a no: \n");
		int n=scanner.nextInt();
        int digitSum=0;
        while(n!=0) {
        	int digit=n%10;
            digitSum+=digit;
            n=n/10;                //removing the last element 
        }
		System.out.println("The of the no is : "+digitSum);		
	}
}
