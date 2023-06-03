package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.List;

public class StringJoinMethodDemo {
	
	public static void main(String[] args) {
      	List<String> asList = Arrays.asList("1","2","3","4");
		String result=String.join("-", asList);
		System.out.println(result);
	}

}
