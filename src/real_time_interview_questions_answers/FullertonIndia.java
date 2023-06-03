package real_time_interview_questions_answers;

import java.util.Arrays;
import java.util.List;

public class FullertonIndia {

	public static void main(String[] args) {
		
		//first round
		List<Integer> list=Arrays.asList(1,2,4,5,6,7,8,9);		
		System.out.println("multiply the all element in the list with 2 and given me only divisible by 10 element");
	    List<Integer> list2 = list.stream().map(x->x*5).filter(x->x%10==0).toList();
	    System.out.println(list2);	
	    
	    //second round
	    
	    
	    
	}
}
