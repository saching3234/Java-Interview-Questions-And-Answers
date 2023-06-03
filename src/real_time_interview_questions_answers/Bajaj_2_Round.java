package real_time_interview_questions_answers;

public class Bajaj_2_Round {

	public static void main(String[] args) {
		//calculate the product of all element except the own element and store that in second array
		int a[]= {1,2,3,4};
		int temp[]= new int[a.length];
		int prod=1;	
	
	    for(int i=0;i<a.length;i++) {
	    	for(int j=0;j<a.length;j++) {
	    		if(i!=j)
	    			prod=prod*a[j];	    		
	    	}
	    	temp[i]=prod;
	    	prod=1;
	    }
	
	    for(int i:temp){
	    	System.out.print(i+" ");
	    }
	
	}			
}
