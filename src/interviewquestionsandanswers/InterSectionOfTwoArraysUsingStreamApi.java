package interviewquestionsandanswers;

import java.util.Arrays;

public class InterSectionOfTwoArraysUsingStreamApi {
	
	public static void main(String[] args) {
		int firstArray[]= {1,2,3,2,3,4,5};
		int secondArray[]= {2,2,3,7,8};

		Arrays.stream(firstArray).filter(x->Arrays.
				stream(secondArray).anyMatch(y->y==x)).distinct(). forEach(System.out::println);
		
		//use the filter,anyMatch and distinct method
       
	}

}
