
package real_time_interview_questions_answers;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Bajaj {
	
	public static void main(String[] args) {
		
		System.out.println("Sorting the element in the ascending order");
		int a[]= {1,9,5,3,5,7};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i:a)
			System.out.print(i+" ");		
		
		System.out.println("\nReverse a number 12345");
		int i=12345;
		
		
		while(i>0) {
		//with the mod you will get the last digit	
		 temp=i%10;
		 System.out.print(temp);
		 //with the /10 you will remove the last digit
		 i=i/10;
		}
		
		System.out.println("\nCalculate the occurances of the string in the sentence");
		String s="Ny Name is is Sachin Sachin";		
		
		Map<String, Long> collect = Arrays.stream(s.split(" ")).
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    System.out.println(collect);
	}
}
