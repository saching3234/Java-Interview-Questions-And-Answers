package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.List;

public class SequantionalAndParallelStreamDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("Printing the data using sequentional stream :");
		list.stream().forEach(e->System.out.println(e+" "+Thread.currentThread().getName()));
		
		System.out.println("---------printing list using the parallel stream----------");
		list.parallelStream().forEach(e->System.out.println(e+" "+Thread.currentThread().getName()));
	}
	
	
}
