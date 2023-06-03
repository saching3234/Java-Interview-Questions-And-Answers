package interviewquestionsandanswers;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StringCharacterCount {
	
	public static void main(String[] args) {
		String input="sachingawadee";
        //1. Finding the each char occurrence		
		//split the string into the array stream using split function of the string		
		Map<String, Long> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));  
	    System.out.println(collect);

	
		//second way without function.identity
        

	    System.out.println("-----------Character count in the string second way -----------");    
	    Map<String, Long> collect2 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(c->c,Collectors.counting()));
	    System.out.println(collect2);
	    
			
	    //find all duplicate element from a given string
	   System.out.println("\n\nDuplicate element from the list :\n");
	    Map<String, Long> collect3 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    
	    List<Entry<String, Long>> list = collect3.entrySet().stream().filter(c->c.getValue()>1).toList();
	    System.out.println(list);
	   
	    //finding the unique element in the string
	    List<String> uniqueElement = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
           entrySet().stream().filter(x->x.getValue()==1)
           .map(Map.Entry::getKey)
           .collect(Collectors.toList());
	    System.out.println("--------Unique element in the list--------------");
	    System.out.println(uniqueElement);
	    
	    System.out.println("\n------dinstinct element----------------\n");
	    List<String> uniquckElement2 = Arrays.stream(input.split("")).distinct().toList();
	   System.out.println(uniquckElement2);
	    
	    
	    
	    
	    System.out.println("--------Finding the first non reapted element in the string-----------");
	    //use the linked hashmap while collecting so that order can be maintained
	  LinkedHashMap<String, Long> collect4 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));   
	  System.out.println(collect4);
	  System.out.println("The first non repeating element is");
	  String s = collect4.entrySet().stream().filter(e->e.getValue()==1).findFirst().get().getKey();
	  System.out.println(s);
	    
	    
	    
	    
	    
	    //finding the first  repeated character in the string
	    //linked hashmap used for maintaining the order
	    System.out.println("-------finding the first  repeated character in the string----------");
	    
	    String key = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
	    .entrySet().stream().filter(e->e.getValue()>2).findFirst().get().getKey();
	
	    System.out.println(key);	    
	}
}
