package real_time_interview_questions_answers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

abstract class MyInterface1{
	static String string="sachin";
	 static void m1() {
		 System.out.println(string);
	 }
}
public class LTI_R_1 {
	 
	public static void main(String[] args) {
	 
	 //count the 1's and 0's in the given string 	
	 String string="11100000";	 
	  Map<String, Long> collect = Arrays.stream(string.split("")).
			 collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println("counting of the 1 and 0 are : ");
	 System.out.println(collect);
	 System.out.println();
	 
	
	//print the unique element in the list
	String s1="abcdabcd";
    Set<String> collect2 = Arrays.stream(s1.split("")).collect(Collectors.toSet());
    System.out.println("the unique element in the list are");
    System.out.println(collect2);
    
    //second way
    Set<String> strings=new HashSet<>(Arrays.stream(s1.split("")).toList());
    System.out.println("Second ways");
    System.out.println(strings);   
   }
}

	
