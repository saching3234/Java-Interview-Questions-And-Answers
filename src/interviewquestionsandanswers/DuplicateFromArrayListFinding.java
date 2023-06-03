package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateFromArrayListFinding {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,20,10,34,56,78,11,20);
		//using the java 8 approach
		System.out.println("The original list is  \n:"+list);
		//Collection.frequency method checks the occurrences of the given element in the given list
		//if element occurred more than one time then that element is duplicate in the list
		 Set<Integer> list2 = list.stream().filter(e-> Collections.frequency(list, e)>1).collect(Collectors.toSet());
	    System.out.println("The duplicates in the array list are");
		System.out.println(list2);
		
		//second approach adding the element in the hashset. if element all ready exist it will
		//return a false that time make it true and collect  same element in new hash set
		HashSet<Integer> hashSet=new HashSet<>();
		Set<Integer> set= list.stream().filter(e->!hashSet.add(e)).collect(Collectors.toSet());
		System.out.println("\nUsing the second approach: \n"+set);	
		

		//using the java 7 approach
		System.out.println("--------------------Java 7 Approach using the set-----------------------");
		Set<Integer> set1=new HashSet<>();
		
		//ding the element in the hashset. if element allready exist it will
		//return a false that time make it true and print that same element as duplicate element 
		for(Integer i:list) {
			if(!set1.add(i))
				System.out.print(i+" ");
		}
		
		System.out.println("\n\n------Printing the list in the reversed order---------");
		List<Integer> list3 = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(list3);		
	
	}
}
