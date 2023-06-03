package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestCharInString {

	public static void main(String[] args) {
		String string="axyzaaaxxxx";
		Map<Object, Long> collect = Arrays.stream(string.split("")).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(collect);
		int count=0;
		char maxReaptedChar = 0;
		
		for (int i = 0; i < string.length(); i++) {
			char c=string.charAt(i);
		    int n=0;	
			for(int j=0;j<string.length();j++) {
		      if(c==string.charAt(j)) 
		    	  n++;
			}
			if(n>count) {
				count=n;
				maxReaptedChar=string.charAt(i);
			}
		}
		
		
		System.out.println("Max time repeated char :"+maxReaptedChar);
		
		
		
	}
}
