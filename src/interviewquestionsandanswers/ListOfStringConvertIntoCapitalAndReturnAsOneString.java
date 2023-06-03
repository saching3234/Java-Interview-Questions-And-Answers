package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringConvertIntoCapitalAndReturnAsOneString {
 
	public static void main(String[] args) {
		List<String> countries=Arrays.asList("india","japan","china","singapur","america");
		
		//convert the each element into capital letters and return the whole list in one string
		//with separating with the commas.
        String collect = countries.stream().map(s->s.toUpperCase()).collect(Collectors.joining(","));
         System.out.println(collect);
	}
}
