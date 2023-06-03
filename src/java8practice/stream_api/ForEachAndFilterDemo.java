package java8practice.stream_api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachAndFilterDemo {

	public static void main(String[] args) {
		List<String> lists=Arrays.asList("sachin","shital","rais","nana");
		
		//tradition method of list traversal
		for(String list:lists )
			System.out.println(list);
		System.out.println("Using the forEach method to print the arraylist elements");
		lists.forEach(System.out::println);
		//using the stream api
		System.out.println("using the stream api method");
		lists.stream().forEach(System.out::println);
		//filtering the list using the tradition method
		for(String l:lists)
		if(l.startsWith("s"))
			System.out.print(l+" ");
		
		//using the stream api and filter method
		lists.stream().filter(l->l.startsWith("s")).forEach(System.out::print);
		
		Map<Integer,String> map=new HashMap<>();
		
		map.put(1, "sachin");
		map.put(2, "ganesh");
		map.put(3,"mahendra");
		map.put(4, "komal");
		//using the foreach method to traverse through the map
		map.forEach((key,value)->System.out.print("\n"+key+"  "+value));
		//using the stream for treaversing through the map
		map.entrySet().stream().forEach(v->System.out.println(v.getValue()));
		//using the filter method on map
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(System.out::println);
		
	}
}
