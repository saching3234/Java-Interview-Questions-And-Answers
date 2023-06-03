package interviewquestionsandanswers;

public class LengthOfLastWordInString {
   public static void main(String[] args) {
	String s="my name is sachin gawade";
    
	//split the string in the arrays using the split method of string
	String[] split = s.split(" ");
     
	System.out.println(split[split.length-1].length());
	
     
   }
}
