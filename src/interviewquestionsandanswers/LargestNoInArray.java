package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.OptionalInt;

public class LargestNoInArray {
	public static void main(String[] args) {
		int a[]= {-1,30,100,2000,3,4,111};
		
		//first approach sort the array and print the last element in the array
		
		 Arrays.sort(a);
		 System.out.println("The largest element in the array: "+a[a.length-1]);
		
		 //second approach finding the largest element in the list
		//Initialize the first element in the array in l
		int l=a[0];
		for(int x:a)
			if(x>l)
				l=x;
		
		System.out.println("The largest element in the array is: "+l);
		
		
		
		
	   //using the stream api approach max method
		int max = Arrays.stream(a).max().getAsInt();
		
	    System.out.println("third approad using stream api: The largest element in the arrays is: "+max);
	}

}
