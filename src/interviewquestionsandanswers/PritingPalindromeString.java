package interviewquestionsandanswers;

import java.util.Iterator;

public class PritingPalindromeString {
	public static void main(String[] args) {
		String s="meme name isi ee gog ";
		//creating the array of string of the above string
	    String[] split = s.split(" ");
	    System.out.println("The palindrome string are prnted below\n");
	    for(String x:split) {
	    	StringBuffer sBuffer=new StringBuffer(x);
	    	if(x.equals(sBuffer.reverse().toString()))
	    		System.out.println(x);
	    }
	}
}
