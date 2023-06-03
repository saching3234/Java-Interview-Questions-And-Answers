package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCounting {

	static public void main(String[] a) {
		String input = "My Name is Sachin is Shital is Gawade Gawade";

		Map<String, Long> collect = Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    System.out.println("Counting of each word");
		System.out.println(collect);
		
		System.out.println("-------Grouping the same size string ------------\n\n");
		
		Map<Integer, List<String>> collect2 = Arrays.stream(input.split(" " )).collect(Collectors.groupingBy(String::length));
		System.out.println(collect2);
		
	    //counting the no of occurrences of the given string.
		String string="is";
	    long count = Arrays.stream(input.split(" ")).filter(s->s.equalsIgnoreCase("is")).count();
	    
	    System.out.println("The  "+string+" is occured :" +count+" times");	
	}	
}
