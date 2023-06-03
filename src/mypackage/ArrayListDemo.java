package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> mylist=new ArrayList<>();
		mylist.add(20);
		mylist.add(30);
		mylist.add(10);
		
		System.out.println(mylist);
		
	     List<Integer> sortedList= mylist.stream().sorted().collect(Collectors.toList());
		
		System.out.println("List Afetr Sorting");
		
		System.out.println(sortedList);
		
		System.out.println(sortedList.get(mylist.size()-2));
		
		System.out.println("Second way");
		Collections.sort(mylist);
		System.out.println(mylist.get(mylist.size()-2));
		
	}
}
