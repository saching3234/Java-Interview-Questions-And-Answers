package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.List;

public class CountBasedQuestions {
	
	public static void main(String[] args) {
		
		String name="my name is sachin gawade";
		long count = Arrays.stream(name.split(" ")).filter(s->s.length()>4).count();
		System.out.println("----Counting the world in the list whose length is greater than 4------");		
	    System.out.println("Answer is : "+count);  
	    
	    System.out.println("--------getting the the words whose length is greater than 2---------");
	    List<String> list = Arrays.stream(name.split(" ")).filter(s->s.length()>2).toList();
	    System.out.println(list);
	}
}
