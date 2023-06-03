package java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class MyPredicate implements Predicate<Integer>{
	@Override
	public boolean test(Integer t) {	
	   return	t%2==0?true:false;
	}	
}

public class PredicateDemo {

	public static void main(String[] args) {		
		//using the traditional method
		MyPredicate predicate1=new MyPredicate();
		System.out.println("Is the 12 the even no or not: "+predicate1.test(12));
		//user defined predicate lambada expression
		Predicate<Integer> predicate = t -> t % 2 == 0;
		System.out.println("The 21 is even or not : " + predicate.test(21));
		
		List<Integer> list = Arrays.asList(12, 45, 3, 67, 8, 90, 1);
		// printing the all even no in the list
		System.out.println("Even nos in the list are :");
		list.stream().filter(predicate).forEach(System.out::println);
		// second way
		System.out.println("Second way of solving is ");
		list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
	}
}
