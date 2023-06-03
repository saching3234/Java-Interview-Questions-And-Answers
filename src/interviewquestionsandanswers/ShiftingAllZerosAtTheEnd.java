package interviewquestionsandanswers;

public class ShiftingAllZerosAtTheEnd {
	
	public static void main(String[] args) {
		int a[]= {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
	    int count=0;
	    for(int x:a)
	    {
	    	//shifting the all not zero element at left 
	    	if(x!=0)
	    		a[count++]=x;
	    }	    
	    while(count<a.length)
	    	a[count++]=0;
		 
	    for(int x:a)
	    	System.out.print(" "+x);
		
		

    }
}
