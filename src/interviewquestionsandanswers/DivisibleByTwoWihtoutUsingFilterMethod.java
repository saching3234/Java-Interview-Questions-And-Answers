package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.List;

public class DivisibleByTwoWihtoutUsingFilterMethod {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,6,1);
		 
		//checking if the all elements are divisible by 2 or not
		boolean allMatch = list.stream().allMatch(i->i%2==0);
		
		if(allMatch)
			System.out.println("All the elements are divisible by 2");
		else
			System.out.println("All the elements are not divisible by 2");
		
		
		
		
		//atleast one no is divisible by 2
        boolean anyMatch = list.stream().anyMatch(i->i%2==0);		
		
		if(anyMatch)
			System.out.println("At least one elements is divisible by 2");
		else
			System.out.println("Not a single elements are not divisible by 2");
		
		
		//by using the filter method
				long count = list.stream().filter(x->x%2==0).count();
				if(count==list.size())
					System.out.println("All the elements are divisible by 2");			
				else
					System.out.println("All the elements are not divisible by 2");
		
	}

}
