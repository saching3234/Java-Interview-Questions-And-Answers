package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArryaMinAndMax {
	
	public static void main(String[] args) {
		int a[]= {10,22,12,67,78,11,56};
		int b[]= {10,20,22,12,11,44};
		int odd[]=new int[a.length];
		int even[]=new int[a.length];
		
		System.out.println("\nThe smallest element in the array: "+a[0]);
		System.out.println("The largest element in the array: "+a[a.length-1]);
		System.out.println("The second smallest element in the array: "+a[1]);
		System.out.println("The second largest element in the array: "+a[a.length-2]);		
		//seperating the odd and even nos in the array
		System.out.println("The even element in the array");
		Arrays.stream(a).filter(e->e%2==0).forEach(e->System.out.print(e+" "));
		System.out.println("\nThe odd element in the arry");
		Arrays.stream(a).filter(e->e%2!=0).forEach(e->System.out.print(e+" "));
		System.out.println("\nThe reversed array");
		//printing the array element in the reverse order
		for(int i=(a.length-1);i>=0;i--)
			System.out.print(a[i]+" ");
		
		//sorted array
		Arrays.sort(a);
		System.out.println("\nThe sorted elements in the  array:");
		Arrays.stream(a).forEach(e->System.out.print(e+" "));
		
		//union of the two array means printing the element of both array and considering the repeated element as one time
		//here we will save the elements in the set of both arrays
		System.out.println("\nThe union of the two arrays");
		Set<Integer> unioOfTwoArrayS=new HashSet<>(Arrays.stream(a).boxed().toList());
		unioOfTwoArrayS.addAll(Arrays.stream(b).boxed().toList());
		System.out.println(unioOfTwoArrayS);
		
		//intersection of two arrays means printing only the common element in both the arrays
		//first add the all elements of first array in the list
		System.out.println("The intersection of two arrays is");
		List<Integer> list = Arrays.stream(a).boxed().toList();
		//now compare all elements in the b array with the a 
		Arrays.stream(b).boxed().filter(e->list.contains(e)).forEach(e->System.out.print(e+" "));
		//calculating the frequency of each element in the array
		int freqArray[]= {10,10,20,20,20,30,50};
		Map<Integer, Long> collect = Arrays.stream(freqArray).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("The frequency of each element in the array elements are ");
		System.out.println(collect);		
		//only showing the elements whose frequency is greater than 1
		System.out.println("Showing the frequency count element whose frequency is greater than 1");
		Map<Integer, Long> collect2 = Arrays.stream(freqArray).boxed().filter(e->Collections.frequency(Arrays.stream(freqArray).boxed().toList(), e)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    System.out.println("The all the elements whose count is >1 is printed");
		System.out.println(collect2);
		
		//Showing only unique elements in the list
		System.out.println("The unique elements in the array are");
		System.out.println(Arrays.stream(freqArray).boxed().collect(Collectors.toSet()));
	}
}
