package interviewquestionsandanswers;

import java.security.cert.X509CRLSelector;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee2StreamOperations {
	
	public static void main(String[] args) {
		List<Employee2> list=Employee2_DB.getListOfEmployees();
		
	
		
		System.out.println("-----average age of male and female employee-------");
        Map<String, Double> avgMaleFemale = list.stream().collect(Collectors.groupingBy(Employee2::getGender,Collectors.averagingDouble(Employee2::getAge)));		
	    System.out.println("The average age of male and female employees are :"+avgMaleFemale );
	    
	    System.out.println("------Priting the employee details departmentwise--------");
	    Map<String, List<Employee2>> departmentWiseEmpList = list.stream().collect(Collectors.groupingBy(Employee2::getDepartment));
	    departmentWiseEmpList.entrySet().stream().forEach(e->{
	    System.out.println(e.getKey());
	    e.getValue().stream().forEach(x->System.out.println( x.toString()));
	    });
	    
	    
	  
	    
	    System.out.println("\n\n-----finding the employee detail who got the highest salary in each department----");
	     
     Map<String, Employee2> highestSalDep = list.stream().
    		 collect(Collectors.groupingBy(Employee2::getDepartment,
    				 Collectors.
    				 collectingAndThen(Collectors
    						 .maxBy(Comparator.comparing(Employee2::getSalary)),Optional::get)));
	 System.out.println(highestSalDep); 
	    
	    
	    
	    
	  Map<String, Employee2> collect = list.stream().collect(Collectors.groupingBy(Employee2::getDepartment,
			  Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee2::getSalary)), Optional::get)));     
	     
	     System.out.println("\n\n-----Max Salaary emp in departmentwise second approach----");
	     System.out.println(collect);
	     
	     
	   System.out.println("--------highest paid male and femal employee details");
	   Map<String, Employee2> maleFemaleHighestSal = list.stream().collect(Collectors
			   .groupingBy(Employee2::getGender,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee2::getSalary)), Optional::get)));
	   System.out.println(maleFemaleHighestSal);  
	}

}
