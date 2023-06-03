package interviewquestionsandanswers;

import java.util.Arrays;

public class CharacterCountingInString {
	public static void main(String[] args) {
		String str = "sachin, ga";
        int charCount=0;
		System.out.println("----Count the characters from the string dont count ',' and space-----");
	    for(char c:str.toCharArray()) 
	    	if(c!=','&&c!=' ')
	    		charCount++;
	    
	    System.out.println("\nThe total characters in the string are : "+charCount);
	    
	    charCount=0;	    
	    //second approach
	  for(int i=0;i<str.length();i++) {
		  if(str.charAt(i)!=','&&str.charAt(i)!=' ')
			  charCount++;
	  }
	    
	    System.out.println("\nSecond Approach : The total characters in the string are : "+charCount);
	
	    System.out.print("\nThe third approach using the stream api: ");
	    long count = Arrays.stream(str.split("")).filter(c->c.toCharArray()[0]!=','&&c.toCharArray()[0]!=' ').count();
	    System.out.print(count);
	    
	}
}
