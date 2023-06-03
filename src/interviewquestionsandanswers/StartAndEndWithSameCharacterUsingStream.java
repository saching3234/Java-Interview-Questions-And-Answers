package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.List;

public class StartAndEndWithSameCharacterUsingStream {

	public static void main(String[] args) {
		List<String> strings=Arrays.asList("aba","bcs","scs","lol","pop","a");
		List<String> list = strings.stream().
				filter(s->s.length()>1&&s.charAt(0)==s.charAt(s.length()-1)).toList();
		System.out.println("The words start and ends with the same characters are :");
		System.out.println(list);
		
		System.out.println("---------Example with the string---------\n\n");
		String string="my name is nan and mam how ara youy";
		List<String> list2 = Arrays.stream(string.split(" ")).filter(s->s.length()>1&&s.charAt(0)==s.charAt(s.length()-1)).toList();
		System.out.println(list2);
	}
}
