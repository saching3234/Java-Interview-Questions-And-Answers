package java8practice.stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapSorting {
	
	public static void main(String[] args) {
		
		//using the traditional approach for sorting treemap
		Map<Employee, Integer> map=new TreeMap<>((e1,e2)->e1.getSal()-e2.getSal());
		
		map.put(new Employee(1, "sachin", 50000), 101);
		map.put(new Employee(2, "sneha", 40000), 101);
		map.put(new Employee(4, "ketan", 30000), 103);
		map.put(new Employee(5, "komal", 20000), 102);
		
		System.out.println("========sorted Treemap by salary in ascending order===========");
		System.out.println(map);
		
		//using the Linked list for sorting the treemap
		//creating the linked list 
		System.out.println("==============srting using the arrayList stream api ============");
		ArrayList<Entry<Employee, Integer>> arrayList = new ArrayList<>(map.entrySet());
		arrayList.stream().sorted((o1,o2)->o1.getKey().getId()-o2.getKey().getSal()).forEach(System.out::println);
		//comparing by the key
		System.out.println("=========Comparing by the key using stream api==========");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);
	}

}
