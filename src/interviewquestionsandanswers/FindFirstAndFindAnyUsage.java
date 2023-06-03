package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindFirstAndFindAnyUsage {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,3,4,5,6,7,8);
		//skip is used to skip the element and findFirst is used for getting the first element
		Integer integer = list.stream().skip(2).findFirst().get();
		System.out.println(integer);
		//find any will select any element from the stream.
		Integer integer2 = list.stream().findAny().get();
		System.out.println(integer2);
		
		//practical use case find first used for getting the largest no form the list
		Integer largeElem = list.stream().sorted(Collections.reverseOrder()).findFirst().get();
	   System.out.println("-------------- Practical use case of the find first element ----------");
	   System.out.println(largeElem);
	   System.out.println("Second largest element in the arraylist\n");
	   Integer secondLarge = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
	   System.out.println(secondLarge);
	}

}
