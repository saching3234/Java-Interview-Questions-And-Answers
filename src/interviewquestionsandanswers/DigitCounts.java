package interviewquestionsandanswers;



public class DigitCounts {

	public static void main(String[] args) {
		int i=123459;
		int count=0;
		
		while(i>0) {
			i=i/10;
			count++;
		}
		System.out.println("The count of all digits are :"+count);
	}
}
