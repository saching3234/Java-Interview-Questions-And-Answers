package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;

import java.util.stream.Collectors;

public class DuplicateCharacterPrintingInString {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String :");
		String string=scanner.next();
		
		//using the traditional approach using the hashSet;
		System.out.println("\n Using the hashset approach \n");
	    HashSet<Character> set=new HashSet<>();
	    for(char c:string.toCharArray()) {
	    	if(set.contains(c))
	    		System.out.println(c);
	    	else
	    		set.add(c);
	    }
		
		
		//using the stream api approach
		//get the count of each charatcer in the string 
	    Map<String, Long> collect = Arrays.stream(string.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    
	    
		//priting the characters and their count
		System.out.println("\n"+collect);
		System.out.println("Using the stream api approach \n");
		//printing those characters only whose count is greater than 1
		System.out.println("");
		collect.entrySet().stream().filter(e->e.getValue()>1).forEach(e->System.out.println(e.getKey()));;
	}
}
