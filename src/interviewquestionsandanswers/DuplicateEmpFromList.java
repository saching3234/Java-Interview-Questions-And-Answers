//count the duplicate emp count

package interviewquestionsandanswers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateEmpFromList {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		Map<String, Integer> map=new HashMap<>();
		employees.add(new Employee("e101", "Sachin", "IT", 20,20));
		employees.add(new Employee("e102", "Satish", "MECH", 30,34));
		employees.add(new Employee("e103", "Satish", "IT", 40,45));
		employees.add(new Employee("e104", "Sachin", "IT", 44,32));
		//System.out.println(employees);
		
		//using the traditional way using the map
		
		//iterate through the list using the for loop
		
		for(Employee e:employees) {
			//if emp name allready present then increase the count
			if(map.containsKey(e.getName())) 
				map.put(e.getName(), map.get(e.getName())+1);
			else
				map.put(e.getName(), 1);			
		}
		
			
		   //print the hashmap
		System.out.println("Usign the traditional ways");
			System.out.println(map);		
		
		
	//using the stream api 
	System.out.println("\n----------Second way using the stream --------\n");
	Map<String, Long> empCount = employees.stream()
			.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
	System.out.println(empCount);
	
	System.out.println("------The duplicate emp names are :");
	empCount.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
	
	}
}
