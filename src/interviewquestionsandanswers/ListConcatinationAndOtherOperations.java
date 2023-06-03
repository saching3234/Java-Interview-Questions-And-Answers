package interviewquestionsandanswers;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListConcatinationAndOtherOperations {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(11,2,13,4,5);
		List<Integer> list2=Arrays.asList(1,2,6,17,8,90,8,3);
		
		//mergining a list with all elements
		List<Integer> list3=Stream.concat(list1.stream(), list2.stream()).toList();
		System.out.println(list3);
		
		//Distinct element list
		List<Integer> list = Stream.concat(list1.stream(), list2.stream()).distinct().toList();
		System.out.println("Distinct element list result: \n"+list);
		
		//another apporach
		Set<Integer> collect = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toSet());
	    System.out.println("The second approach using set : \n"+collect);
	    
	    //finding the min and max element in the list
	    System.out.println("min element: "+collect.stream().min(Comparator.comparing(e->e)).get());
	    System.out.println("Max element : "+collect.stream().max((e1,e2)->e1.compareTo(e2)).get());
	    System.out.println("The element start with 1 is displayed below \n");
	    collect.stream().filter(i->(i+"").startsWith("1")).forEach(System.out::println);
	
	     System.out.println("square of all elements in the list: \n");
	    collect.stream().map(i->(i*i)).forEach(System.out::println);
	    
	    System.out.println("Average of  of all >100 elements in the list: \n");
	    OptionalDouble asDouble = collect.stream().mapToInt(i->(i*i)).filter(i->i>8100).average();
         if(asDouble.isPresent())        		 
        		 System.out.println("Average of all >100 squared element is : "+asDouble.getAsDouble());
         else
        	 System.out.println("Filter does not got any >100 element ");
	    int sum = collect.stream().mapToInt(i->(i*i)).filter(i->i>100).sum();
	    System.out.println("The sum is :"+sum);
	}
}
