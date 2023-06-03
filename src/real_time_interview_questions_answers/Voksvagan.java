package real_time_interview_questions_answers;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

//making a single ton class
public class Voksvagan {
	
	private static Voksvagan voksvagan;
	
	private Voksvagan() {}
	
	
	public static synchronized Voksvagan getInstance() {
		  
		if(voksvagan==null) {
			voksvagan=new Voksvagan();
		}
		
		return voksvagan;
	}
	
	public static void main(String[] args) {
      Voksvagan voksvagan=Voksvagan.getInstance();
      Voksvagan voksvagan2=Voksvagan.getInstance();
      System.out.println("Single ton comparison");
      
      System.out.println(voksvagan.equals(voksvagan2));
		String str="abcxxxxxxxyzaaa";
		int maxCount=0;
		char repeatedChar = 0;
		for(int i=0;i<str.length();i++) {
			int charCount=0;
			for(int j=0;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					charCount++;
				}
				
				if(charCount>maxCount)
				{
					maxCount=charCount;
					repeatedChar=str.charAt(i);
				}
				
			}
		}
		System.out.println("The most repeated character in the string is");
		System.out.println(repeatedChar);	
		
		//second way using the stream api
		
		Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		long count=0;
		String mostRepeatedChar="";
		
		for(Entry<String,Long> entry :collect.entrySet()) {
	        if(entry.getValue()>count) {
	        	count=entry.getValue();
	        	mostRepeatedChar=entry.getKey();
	        }
		}
		System.out.println("Second way");
		System.out.println(mostRepeatedChar);
		
	}
}
