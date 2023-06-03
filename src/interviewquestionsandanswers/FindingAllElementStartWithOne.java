package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.List;

public class FindingAllElementStartWithOne {
   public static void main(String[] args) {
	int [] numbers= {5,9,11,2,8,21,1,29,211};
	//convert the arrays into the stream
	//boxed is used for autoboxing purpose here map(s->s+"") will convert every int array element into Integer 
	System.out.println("----------getting the element from the array which is starting with the 2");
	List<Integer> noStarWith2 = Arrays.stream(numbers).boxed().filter(i->i.toString().startsWith("2")).toList();
	System.out.println(noStarWith2);
	
	List<Integer> list2=Arrays.asList(10,20,15,30,16,30,45);
	System.out.println("\n\n------Getting the all the emelent from the list who star with the 1-----");
	List<Integer> startWithOne = list2.stream().filter(i->i.toString().startsWith("1")).toList();
	System.out.println(startWithOne);
	
	
	System.out.println("\n\n ------------Second approach---------------\n");
	List<String> list = Arrays.stream(numbers).boxed().map(i->i+"").filter(i->i.startsWith("1")).toList();
	
	System.out.println(list);
  }
}
