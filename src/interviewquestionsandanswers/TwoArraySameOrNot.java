package interviewquestionsandanswers;

import java.util.Arrays;

public class TwoArraySameOrNot {
	
	public static void main(String[] args) {
		int a[]= {12,22,33,44};
		int b[]= {12,22,33,44};
		
		 if(checkArrays(a, b))
			 System.out.println("both the arrays are equals");
		 else
			 System.out.println("Both the arrays are not equals");
	}
	
	static boolean checkArrays(int a[],int b[]) {
		//check the length is equal or not if not return false
		if(a.length!=b.length)
			return false;
		
		//sort both the arrays
		Arrays.sort(a);
		Arrays.sort(b);
		
		//now check the elements are same or not
		
		for(int i=0;i<a.length;i++) {
			//if two arrays are not equals then return true
			if(a[i]!=b[i])
				return false;
		}
		
		 //if controller is coming here then two arrays are equals
		return true;		
	}

}
