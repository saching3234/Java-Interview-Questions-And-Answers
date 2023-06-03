package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.Optional;

public class LongestString {
	public static void main(String[] args) {
		String string="sachin gawadeSr at post patas tal daundhhjhj dist pune";
	    String reduce = Arrays.stream(string.split(" ")).reduce((e1,e2)->e1.length()>e2.length()?e1:e2).get();
	   System.out.println(reduce);
	}
}
