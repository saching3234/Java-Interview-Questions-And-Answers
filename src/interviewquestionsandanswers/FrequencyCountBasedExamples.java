package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FrequencyCountBasedExamples {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("AA","BB","AA","CC","BB","DD","EE","DD");
		//first approach showing those element whose count is greater than 1
		   Map<String, Long> duplicateStringCount = list.stream().filter(s->Collections.frequency(list, s)>1).
				 collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println("The duplicate count  list :\n"+duplicateStringCount);
		
		
		
		
		//showing all chars count
         Map<String, Long> allStringCount = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    System.out.println("\n ------All string count ------\n"+allStringCount);
	    
	    //showing those element whose count is greater than 1
	    List<Integer> intList=Arrays.asList(1,2,3,4,5,1,2,3,8,9,11);
        Map<Integer, Long> duplicateElemCount = intList.stream().filter(e->Collections.frequency(intList, e)>1) .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));     
	   System.out.println("\n------ Duplicate element count--- \n"+ duplicateElemCount);
	   
	}
}
