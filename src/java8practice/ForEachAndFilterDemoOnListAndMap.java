package java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ForEachAndFilterDemoOnListAndMap {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("sachin","sneha","shital","nana","ketan");
		System.out.println("======== Traversing using the normal for loop =============");
		
		for(String name:list)
			System.out.println(name);
		
		System.out.println("======== Traversing using  forEach loop =============");
		list.forEach(System.out::println);
		System.out.println("======== Traversing using the stream api foreachloop =============");
	    list.stream().forEach(System.out::println);
	    System.out.println("======== printing the name using filter start with s using foreach loop =============");
	    list.stream().filter(n->n.startsWith("s")).forEach(System.out::println);	    
	    Map<Integer, String> map=new ConcurrentHashMap<Integer, String>();
	    map.put(1, "reshma");
	    map.put(2, "kiran");
	    map.put(3, "monica");
	    map.put(4, "komal");
		System.out.println("======== Traversing map using  foreachloop =============");
	    map.forEach((k,v)->System.out.println(k+" :  "+v));
		System.out.println("======== Traversing map using stream foreachloop =============");	    
	    map.entrySet().stream().forEach(o->System.out.println(o.getKey()+" : "+o.getValue()));
		System.out.println("======== fltering even no map using filter and pringting using foreachloop =============");
		map.entrySet().stream().filter(o->o.getKey()%2==0).forEach(System.out::println);		
	}
}
