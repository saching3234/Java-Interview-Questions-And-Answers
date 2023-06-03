package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.Collections;


public class SecondHigestNoInArray {
	public static void main(String[] args) {
	  int a[]= {1,2,2,4,5,7,1,9,7,8};
	  int temp;
	  //sort array using the selection sort
	  for(int i=0;i<a.length;i++)
		  for(int j=i+1;j<a.length;j++) {
			  if(a[i]>a[j]) {
				  //swap
				  temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;				  
			  }
		  }
	  for(int i:a)
		  System.out.print(i+" ");	  
	  
	  System.out.println("\nSecond highest no is  :"+a[a.length-2]);
	  
	  /*----------------------Second Approach ----------------*/
	  int b[]= {1,2,2,4,5,7,1,9,7,8};
	  //sort the array using the Arrays.sort method
	  Arrays.sort(b);
	  System.out.println("Using the second approach : "+b[b.length-2]);
	  
	  System.out.println("-------------using the stream api------------");
	  Integer integer = Arrays.stream(b).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
	  System.out.println(integer);
	 
	
	}
	
}




