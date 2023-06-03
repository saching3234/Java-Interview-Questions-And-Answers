package java8practice.stream_api;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(23,12,45,77,88,90);		
		//sort using the traditional method		
		//in the ascending order
		Collections.sort(list,(o1,o2)->o2.compareTo(o1));
		System.out.println(list);
		//in the descending order
		/*
		 * Collections.reverse(list); System.out.println(list);
		 */
		
		//using the stream api
		list.stream().sorted().forEach(System.out::println);
		System.out.println("List in the reverse order \n");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
