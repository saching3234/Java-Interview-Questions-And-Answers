package interviewquestionsandanswers;



public class StringRelatedQuestions {

	public static void main(String[] args) {
		String string="cloudtech";
		String newString="";
		
		//remove all c present in the string without using the replaceAll method
		System.out.println("---------Using the replce all method-------");		
		System.out.println(string.replaceAll("c", ""));
		
		System.out.println("----------Usinng the manual method----------");
		for(char c:string.toCharArray()) {
			if(c!='c')
		   	newString+=c;
		}
		
		System.out.println(newString);
		
		
		//Make the first part of the string in the small case and second part as capital letter
		
		String nameString="my name is sachin my name is sachin";
		int midOfString=nameString.length()/2;
		String smallcaseString="",uppercaseString="";
		
		for(int i=0;i<nameString.length();i++) {
			if(i<midOfString)
		   smallcaseString+=Character.toLowerCase(nameString.charAt(i));	
			else
				uppercaseString+=Character.toUpperCase(nameString.charAt(i));
		}
		
		System.out.println(smallcaseString+uppercaseString);
		
		
		//counting the special characters and characters in the given string
		String s="sachin###$$$2";
		int specialCharCount=0;
		int charCount=0;
		
	      for(char c:s.toCharArray()) {
	    	  if(Character.isDigit(c)||Character.isAlphabetic(c)||Character.isWhitespace(c)) {
	    		  charCount++;
	    		System.out.print(c);  
	    	  }
	    	  else
	    		  specialCharCount++;
	      }
	      
	      System.out.println("\nThe Characters count is :"+charCount);
	      System.out.println("\nThe special character count is :"+specialCharCount);
		
		
		
	}
}
