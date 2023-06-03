//reverse a string
package interviewquestionsandanswers;

import java.util.Iterator;

public class StringReverse {
	
	public static void main(String[] args) {
		String string="My Name is sachin";
		
		//use the for loop
		for(int i=string.length()-1;i>=0;i--)
			System.out.print(string.charAt(i));
		
		//using the string buffer
		StringBuffer sb=new StringBuffer(string);
		System.out.println("\n The String is  reversed using the string buffer :\n "+sb.reverse());
		
		System.out.println("-----------------Reverse the sentence--------------");
		String s[]=string.split(" ");
		String revSentence="";
		System.out.println(s.length-1);
		for(int i=s.length-1;i>=0;i--)
			revSentence+=s[i]+" ";
		
		System.out.println(revSentence);
	/*-------------------------------------------------------------------------------------*/	
		String name="My Name is sachin I from pune city";
		String names[]=name.split(" ");
		String startWord="is", endWord="pune";
		 int startCount=0,endCount=0;
		if(name.contains(startWord)&&name.contains(endWord))
		{
			for(int i=0;i<names.length;i++) {
				if(names[i].equals(startWord)) {
					startCount=i;
					for(int j=i+1;j<names.length;j++) {
						if(names[j].equals(endWord))
							endCount=j;
					}
				}
			}
		}
		else {
			System.out.println("Sorry start or end word is not present in the name string");
		}
		
		if(startCount!=0&&endCount!=0)
			System.out.println("\nDistance between two words is :"+(endCount-startCount-1));
	}
}
