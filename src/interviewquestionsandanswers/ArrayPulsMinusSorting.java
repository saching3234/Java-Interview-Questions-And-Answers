package interviewquestionsandanswers;

import java.util.Arrays;

public class ArrayPulsMinusSorting {

	public static void main(String[] args) {
		int a[]= {-10,2,-20,-2,4,-5,6};
        int b[]=new int[a.length];
        int x=a.length-1;
        int s=0;
        
        for(int i:a) {
        	if(i>0)
        		b[s++]=i;
        	else 
        		b[x--]=i;
        }
        
        System.out.println("first using manually checking  approach and using second array\n");
        for(int y:b)
        	System.out.print(y+" ");     
		
		
		
		//first approach sort the array using the sort method it will sort in ascending order
		//Arrays.sort(a);
	   // for(int x:a)
	    //	System.out.print(x+" ");
	    
	   //manually sorting using the selection sort
		System.out.println("\n\nUsing the sorting selection sorting methdod :\n");
	    
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]<a[j]) {
					//swap
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp; 	}	}	}		
		
	    for(int y:a)
	    	System.out.print(y+" ");
	    
	    
	    //using sort method of array
	    System.out.println("\nusing the sort method");
	    Arrays.sort(a);
	    for(int y:a)
	    	System.out.print(y+" ");
	    	
	    
	}
}
