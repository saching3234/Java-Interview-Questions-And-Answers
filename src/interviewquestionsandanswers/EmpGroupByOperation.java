package interviewquestionsandanswers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpGroupByOperation {
	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee("e1", "sachin", "it", 30000,22));
		employees.add(new Employee("e2", "mahesh", "it", 40000,34));
		employees.add(new Employee("e3", "rais", "eee", 20000,45));
		employees.add(new Employee("e4", "nitin", "eee", 70000,21));
		
		//find the distinct department in the list 
		//use the map here
	    System.out.println("The Distinct department list");
		List<String> list = employees.stream().map(e->e.getDep()).distinct().toList();
		System.out.println(list);
		
	    System.out.println("The cout in the each department of employees");
	    System.out.println("The Employee count department wise ");
           Map<String, Long> depWiseCount = employees.stream().collect(Collectors.groupingBy(Employee::getDep,Collectors.counting()))       ;
	    
	    System.out.println(depWiseCount);
        //using the old method
        Map<String, Integer> depCount=new HashMap<>() ;
        
        employees.stream().forEach(e->{
          if(depCount.containsKey(e.getDep()))
        	 depCount.put(e.getDep(), depCount.get(e.getDep())+1);
          else
        	  depCount.put(e.getDep(), 1);
        });
        
        System.out.println("\n \n--------Using the traditional method------------\n\n");
        System.out.println(depCount);
        
	    System.out.println("\n\n Finding the average age of emp departmentwise\n");
	    Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDep,Collectors.averagingDouble(Employee::getAge)));
	    System.out.println(collect);
	   
	}	
}
