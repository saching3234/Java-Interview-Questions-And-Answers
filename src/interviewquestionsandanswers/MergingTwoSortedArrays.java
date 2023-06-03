package interviewquestionsandanswers;

import java.security.AlgorithmConstraints;
import java.util.Arrays;

public class MergingTwoSortedArrays {
 
	 public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int b[]= {5,6,7};
		int mergeArr[]=new int[a.length+b.length];
		
		//copy the first array into mergeArray using system.arrayCopy method
        System.arraycopy(a, 0, mergeArr, 0, a.length);
     		
		//copy the second array
		System.arraycopy(b, 0, mergeArr, a.length, b.length);
		
		System.out.println("Before sorting array :\n");
		//now print the array
				for(int i:mergeArr)
					System.out.print(i+" ");
		
		//now sort the merged array
        Arrays.sort(mergeArr);
		//now print the array
        System.out.println();
        for(int x:mergeArr)
        	System.out.print(x+" ");
	}	
}
