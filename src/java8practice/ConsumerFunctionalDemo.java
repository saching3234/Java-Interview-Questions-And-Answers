package java8practice;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


//old way of using the interfaces
class MyClass implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("The value i got from the user is :"+t);		
	}	
}


public class ConsumerFunctionalDemo {

	public static void main(String[] args) {
	
		//old way
		  MyClass myClass=new MyClass();
		  myClass.accept(123);
		
	  //creating the lambad expression of consumer interface
	  Consumer<Integer> com=t->System.out.println("Printing the value :"+t);	  
	  com.accept(120);
	  
	
	  List<Integer> list=Arrays.asList(12,34,56,11,67);
	  
	  //printing the list element by using the forEach loop who accept the Consumer 	  
	  list.stream().forEach(com);
	  //using the second way
	  list.stream().forEach(l->System.out.println("The second ways of spring list :"+l));
	  //third way of printing the list element using the method reference
	  list.stream().forEach(System.out::println);
	  System.out.println("Map using the  consumer interface");
	  
	  System.out.println("==========================compute if present method==========================");
	  Map<String, Integer> ageMap = new HashMap();
	  ageMap.put("Alice", 20);
	  String name = "Alice";
	  int age = ageMap.computeIfAbsent(name, key -> 25);	
	  System.out.println("The age of the alice : "+age);
	  System.out.println(ageMap);
	  
	  
	}
}
