package java8practice.stream_api;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortDemo2 {
	
	public static void main(String[] args) {
		List<Employee> list=DataBase.getEmployees();
		System.out.println("sort the list using the collections.sort() method");
		
		Collections.sort(list,(e1,e2)->e2.getSal()-e1.getSal());
		System.out.println(list);
		
		//sort using the stream api
		List<Employee> collect = list.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
	
	   System.out.println("\nThe list is sorted using the names with stream api\n");
	   System.out.println(collect);
	   
	   //using the the Camparator.comparing method for sorting using the method reference
	   System.out.println("\n using the the Camparator.comparing method for sorting using the method reference");
	   list.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println);	   
	}

}
