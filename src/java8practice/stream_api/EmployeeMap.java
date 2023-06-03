package java8practice.stream_api;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeMap {

	public static void main(String[] args) {
	 Map<Employee, Integer> empMap=new TreeMap<>();
	 empMap.put(new Employee(176,"sachin",90000), 60);
	 empMap.put(new Employee(178,"shital",56000), 56);
	 empMap.put(new Employee(177,"satish",60000), 20);
	 empMap.put(new Employee(179,"ketan",26000), 36);	 
	 //sort using the emp salary
	 empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed())).forEach(System.out::println);
	}
}
