package java8practice;

import java.util.Arrays;
import java.util.List;

public class IntergerArrayListOperations {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,45,23,67,22,123,87,99);		
		list.stream().filter(i->i%2!=0).sorted((i,j)->j.compareTo(i)).forEach(System.out::println);		
	}
}
