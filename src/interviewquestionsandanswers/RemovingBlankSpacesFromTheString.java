package interviewquestionsandanswers;

import java.util.Comparator;

public class RemovingBlankSpacesFromTheString {
	
	public static void main(String[] args) {
		String string="  sachin  gawade   ";
		string=string.replaceAll(" ","");		
		System.out.println(string);	
		
	}
}
