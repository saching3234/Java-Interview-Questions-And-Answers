package interviewquestionsandanswers;

public class DividingStringIntoTwoParts {
	
	public static void main(String[] args) {
		String string="abcdef";
		int n=2;
		int stringPart=string.length()/2;
		String[] stringParts=new String[stringPart];
		int temp=0;
		
		if(string.length()%2!=0)
			System.out.println("Sorry string is not possible to divide into two parts");
		else {
			for(int i=0;i<string.length();i=i+stringPart) {
				String part=string.substring(i,i+stringPart);
			    stringParts[temp]=part;
			    temp++;
			}
			
			//print the string array
			for(String s:stringParts)
				System.out.println(s);
		}		
	}
}
