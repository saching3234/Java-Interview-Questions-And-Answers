package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.List;

public class IntegerArrayListOperations {
 
	public static void main(String[] args) {
		
	
	List<Integer> list=Arrays.asList(10,20,30,40,50);
  
   //get the sum of all element and print the sum by adding in each element
  //using the reduce method for calculation of sum of all elements
   
	  Integer sum = list.stream().reduce(0, (a,b)->a+b);
	System.out.println("Sum is : "+sum+" \n");
	//now add sum in each element and print use the map
	List<Integer> list2 = list.stream().map(e->e+sum).toList();
	
	System.out.println(list2);
	
 } 
}
