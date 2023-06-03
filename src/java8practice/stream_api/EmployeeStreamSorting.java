package java8practice.stream_api;

import java.util.Comparator;
import java.util.List;

public class EmployeeStreamSorting {
	
	public static void main(String[] args) {
		List<Employee> employees=DataBase.getEmployees();
		
		//sort using the comparator compare method
	    System.out.println("descending sorting using the emp id");	
		employees.stream().sorted((o1,o2)->o2.getId().compareTo(o1.getId())).forEach(System.out::println);
		//using the method reference
		System.out.println("\n Sorting the list using emp name : \n");
		employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	}
}
