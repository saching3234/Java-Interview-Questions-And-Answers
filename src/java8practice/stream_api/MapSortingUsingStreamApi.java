package java8practice.stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortingUsingStreamApi {	
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("ten", 10);
		map.put("four", 4);
		map.put("six", 6);		
	    System.out.println(map);
		
		//sorting using the traditional method
		//get the entry set in the list format
	  List<Entry<String, Integer>> arrayList = new ArrayList<>(map.entrySet());
      //sort using the collections sort method
	  System.out.println("=====sorted using the collections sort method using the java 8 logic");
	  Collections.sort(arrayList,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
      //iterating using the for loop
	  for(Entry<String,Integer> entry:arrayList)
	  System.out.println(entry.getKey()+"  "+entry.getValue());
	  
	  //using the map stream method
	  System.out.println("*********** Sort using the stream ************");
	  map.entrySet().stream().sorted((o1,o2)->o2.getKey().compareTo(o1.getKey())).forEach(System.out::println);
	  //second way
	  System.out.println("********Second way comparingByKey()******");
	  map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	  System.out.println("********Compare by comparingByValue() ******");
	  map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);	  
	}
}
