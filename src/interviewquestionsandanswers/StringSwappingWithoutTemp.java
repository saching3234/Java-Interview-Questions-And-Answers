package interviewquestionsandanswers;

public class StringSwappingWithoutTemp {
	
  public static void main(String[] args) {
	String string1="sachin";
	String string2="gawade";
	
	//first concat the string in the string1
	string1+=string2;
	System.out.println(string1);
	//now get the first string from concated string into string2
	string2=string1.substring(0, string1.length()-string2.length());
	System.out.println("string2 :" +string2);
	//now get the string2 in the string1
	string1=string1.substring(string2.length());
	System.out.println("string 1: "+string1);	
}	

}
