package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class ArrayIntersectionUnion {
	
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8};
		int b[]= {4,1,22,3,5,6};
		interSection(a, b);
		uninOfTwoArrays(a, b);
	}
	
	
	//union of two arrays mean printing only the distinct element from both the arrays
	static void uninOfTwoArrays(int a[],int b[]) {
		//create the set and add the element of two arrays in set 
		//set does not allow the duplicate element
		Set<Integer> unionSet=new HashSet<>(Arrays.stream(a).boxed().toList());
		unionSet.addAll(Arrays.stream(b).boxed().toList());
		System.out.println("\nThe union of two element arrays : \n"+unionSet);
	}	
	
	
//intersection of two array means :- only the common element printing from both the arrays 	
 static void interSection(int a[],int b[]) {
	 //first add the all elements in the set collection of first array
	  Set<Integer> intersectionSet=new HashSet<>(Arrays.stream(a).boxed().toList());	  
	 //now traverse through the second array and check the second array's element is present in that
	 //set or not if  present then print that element 
	  System.out.println("The intersection of two array is printed below: ");
	 Arrays.stream(b).boxed().filter(x->intersectionSet.contains(x)).forEach(x->{
		 System.out.print(x+" ");
	 }); 
	
  }
	
	

}
