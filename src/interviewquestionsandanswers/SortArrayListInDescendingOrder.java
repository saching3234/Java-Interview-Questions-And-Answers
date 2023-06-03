package interviewquestionsandanswers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortArrayListInDescendingOrder {

	public static void main(String[] args) {
		List<Integer> arrayList=new ArrayList<>();
		arrayList.add(12);
		arrayList.add(23);
		arrayList.add(78);
		arrayList.add(89);		
	//first approach
		arrayList.stream().sorted((i,j)->j-i).forEach(System.out::println);	
	//second approach
		System.out.println("----\nSecond approach-------\n");
		arrayList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);		
	}
}
