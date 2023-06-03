package interviewquestionsandanswers;

import java.util.Random;
import java.util.Scanner;

public class RandomNoGenerationUsingTheStreamApi {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the limit for random no generation");
		int n=scanner.nextInt();
		Random random=new Random();
		random.ints(1, 100).limit(n).forEach(System.out::println);		
	}
}
