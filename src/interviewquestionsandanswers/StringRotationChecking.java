package interviewquestionsandanswers;

public class StringRotationChecking {

	public static void main(String[] args) {
		String string1="cloudtech";
		String string2="techclouu";
		
		//first check the length of two strings are equal or not
		
		if(string1.length()!=string2.length())
			System.out.println("string 2 is not the rotation of string1");
		else {
			 //concat the string1 and string2
			string1+=string2;
			System.out.println(string1);
			//now check the string two is rotation of string1 or not
			if(string1.indexOf(string2)!=-1)
				System.out.println("String 2 is the rotation of the string1 ");
			else
				System.out.println("string 2 is not the rotation of string1");
		}
	}
}
