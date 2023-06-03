package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNoInTheArrayUsingStream {
	public static void main(String[] args) {
		 int a[]= {1,2,2,4,5,7,1,9,7,8};
		 //boxed is used to convert the int into Interger object type
		 Integer secondHighest = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder())
				 .skip(1)
				 .findFirst().get();
		 System.out.println("---------second highest no in the list-----");
	     System.out.println(secondHighest);	  
	     
	     //finding the second lowest no in the array
	     Integer integer = Arrays.stream(a).boxed().sorted().skip(1).findFirst().get();
	     
	     System.out.println("-----------second lowest no is ----------\n"+integer);
	     
	     
	}

}
