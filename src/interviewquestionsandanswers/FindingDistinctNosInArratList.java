package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindingDistinctNosInArratList {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(20,30,30,40,12,90,30,20,40);
		System.out.println("The original list :\n "+list);		
		System.out.println("The new list of distinct(element duplicte) elements usingn the java 8");
	    List<Integer> distinctElem = list.stream().distinct().toList();
		System.out.println(distinctElem);
		
		//using set directly add the list to the hash set constructor
        System.out.println("-------Using  the set for storing the element------");
		Set<Integer> distinctSet=new TreeSet<>(list);
        System.out.println(distinctElem);
 
	}
}
