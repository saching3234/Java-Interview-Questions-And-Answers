package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortOneAndZero {
   
	public static void main(String[] args) {
	    int a[]= {1,0,1,0,1,0,1,0,1};
	    int temp;
	    //used the selection sort method
	    for(int i=0;i<a.length;i++)
	    	for(int j=i+1;j<a.length;j++) {
	    		if(a[i]>a[j]) {
	    		//swap
	    		temp=a[i];
	    		a[i]=a[j];
	    		a[j]=temp;
	    		}
	    	}
	    
	    //print the array 
	    for(int i:a)
	    	System.out.print(i);
	    
	    //using the stream api
	    System.out.println("-------using the stream api -----\n");
	    List<Integer> list = Arrays.stream(a).boxed().sorted(Collections.reverseOrder()).toList();
	    System.out.println(list);
	    
	    
	    /*------------ Counting the nos presen in the list -------*/
	    //on array stream use boxed method for int to Integer casting 
	   
	    
	    
	    Map<Integer, Long> count = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    
	    System.out.println("\n"+count);
	    
	    //on linked list
	    List<Integer> intList=Arrays.asList(1,1,1,1,0,0,0,0);
	   
	   Map<Integer, Long> collect = intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())); 
	    System.out.println("\n The count of 1 and 0 is :\n");
	    System.out.println(collect);
	    
	    List<Integer> intList2=Arrays.asList(4, 7, 3, 4, 3, 7, 7);
	    Map<Integer, Long> collect2 = intList2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())); 
	    
	    System.out.println(collect2);
	}
}
