package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//stream type
//sequational stream-uses one core of cpu
//parallel stream-uses multiple cores on cpu

//intermediate operation
//map
//filter
//sorted

//terminal operation
//forEach
//collect


public class StreamOperationOnListIntergerType {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(61,1,11,44,2,3,4,5,6,7,8,9);
		 
		//square the the each element in the list
		List<Integer> squareList=numbers.stream().map(x->x*x).toList();
		System.out.println("The square of all elements in the list is");
		System.out.println(squareList);
		//filtering the even nos in the list
		List<Integer> evenList = numbers.stream().filter(x->x%2==0).toList();
	    System.out.println("Even no list :\n"+evenList);
	    
	    List<Integer> sortedList = numbers.stream().sorted().toList();
	    System.out.println("Sorted list in ascending order :"+sortedList);
	    
	    List<Integer> reversedList = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	    System.out.println("Reversed order list :\n"+reversedList);
	    
	    Integer minValue = numbers.stream().min((e1,e2)->e1-e2).get();
	    System.out.println("Minimum Value from the list is : "+minValue);
	    Integer maxValue = numbers.stream().max(Comparator.comparing(e->e)).get();
	    System.out.println("Maximum value from the list is :"+maxValue);
	    
	    System.out.println("----Sorting in the ascending and storing the result in string----\n");
	    String collect = numbers.stream().sorted().map(e->e+"").collect(Collectors.joining(","));
	    System.out.println(collect);
	    
	}
}
