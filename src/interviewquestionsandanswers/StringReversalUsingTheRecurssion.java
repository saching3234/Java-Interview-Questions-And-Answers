package interviewquestionsandanswers;

public class StringReversalUsingTheRecurssion {
	
	public static void main(String[] args) {
		System.out.println(reverseString("sachin gawade"));
	}

	
	public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

	
}
