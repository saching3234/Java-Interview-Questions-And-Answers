package interviewquestionsandanswers;

public class FibonacciSeries {

	static void fibSeries(int n) {
		int num1=0,num2=1;
		int counter=0;
		while(counter<n) {
			System.out.print(num1+" ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			counter++;				
		}
	}
	
	
	public static void main(String[] args) {
		fibSeries(10);
	}
}
