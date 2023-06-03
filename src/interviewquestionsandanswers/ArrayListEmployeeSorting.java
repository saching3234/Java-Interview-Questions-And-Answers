package interviewquestionsandanswers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListEmployeeSorting {
	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
	
		employees.add(new Employee("e2", "mahesh", "ce", 40000,34));
		employees.add(new Employee("e3", "rais", "IT", 20000,45));
		employees.add(new Employee("e4", "nitin", "ce", 70000,21));
		employees.add(new Employee("e5","ketan","IT",89000,27));
		
		//sort the emp list in ascending order using the salary
		List<Employee> sortedBySal=employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();		
		System.out.println(sortedBySal);		
		
		//sort the list using descending order using the age
        List<Employee> list = employees.stream().sorted((e1,e2)->e2.getAge()-e1.getAge()).toList();
		
		System.out.println("\nSorted by age in descending orde\n"+list);
		
		//getting the highest paid salary in emp
		System.out.println("Highest paid salary emp details");
		Employee maxSalemployee = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(maxSalemployee);
		
		System.out.println("Minimum salary employee :");
		Employee minSalEmp = employees.stream().min(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(minSalEmp);
		
	    System.out.println("Max paid emp in the each department :");
	    Map<String, Employee> maxSalEmpDepWise = employees.stream().
	    		collect(Collectors.groupingBy(Employee::getDep,
	    				Collectors.collectingAndThen(Collectors
	    						.maxBy(Comparator.comparing(Employee::getSalary)),Optional::get)));	    
	    System.out.println(maxSalEmpDepWise);
	}
}
