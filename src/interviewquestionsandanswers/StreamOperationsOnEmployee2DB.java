package interviewquestionsandanswers;


import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamOperationsOnEmployee2DB {
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		List<Employee2> employee2s=Employee2_DB.getListOfEmployees();
		//System.out.println(employee2s);
		//calculating the male and female count emps
		System.out.println("=======calculating the male and female count emps======");
		
		Map<String, Long> collect = employee2s.stream().collect(Collectors.groupingBy(Employee2::getGender,Collectors.counting()));		
		
		System.out.println(collect);
	
	
        System.out.println("======priting the all the department name in the organizatin======");
        
        List<String> list = employee2s.stream().map(e->e.getDepartment()).distinct().toList();
        
        System.out.println(list);
    	
 
        System.out.println("========Average age of male and femmale employees====");
         Map<String, Double> collect2 = employee2s.stream().collect(Collectors.groupingBy(Employee2::getGender,Collectors.averagingDouble(Employee2::getAge)));
         System.out.println(collect2);
        
        System.out.println("======Maximum salary getting employee details");
        Employee2 emp = employee2s.stream().max(Comparator.comparing(Employee2::getSalary)).get();
        
        System.out.println(emp);	    

	    System.out.println("=======get the name of employees who joined after 2015=====");
        List<Employee2> list2 = employee2s.stream().filter(e->e.getYearOfJoining()>2015).toList();
        System.out.println(list2);
	    
	    
       
	    System.out.println("======Count the no of employees in each depatment");
        Map<String, Long> collect3 = employee2s.stream().collect(Collectors.groupingBy(Employee2::getDepartment,Collectors.counting()));
        collect3.entrySet().forEach(e->{
        	System.out.println(e.getKey()+":"+e.getValue());
        }); 
	    
	    System.out.println("=====Average Salary of each department=======");
	   Map<String, Double> collect4 = employee2s.stream().collect(Collectors.
			   groupingBy(Employee2::getDepartment,
					   Collectors.averagingDouble(Employee2::getSalary)));
	    collect4.entrySet().stream().forEach(e->{
	    	System.out.println(e.getKey()+": "+e.getValue());
	    }); 
	   
		
	    System.out.println("=====Minimum age Male employee in IT Department======= ");
	    Optional<Employee2> min = employee2s.stream().filter(e->e.getDepartment().
	    		equals("IT")&&e.getGender().equals("male")).min(Comparator.comparing(Employee2::getAge));
	    
	    System.out.println(min.get());
	    
	 
	    System.out.println("====the employee details who has the most working experiance in the organization====");
	    Optional<Employee2> seniorEmp = employee2s.stream().sorted(Comparator.comparing(Employee2::getYearOfJoining)).findFirst();
	    System.out.println(seniorEmp.get());
	    
	    System.out.println("----second method------------------\n");
	    Employee2 emp2 = employee2s.stream().min(Comparator.comparing(Employee2::getYearOfJoining)).get();
	    System.out.println(emp2);
	    
	    System.out.println("====Male and female employees in the IT detaprtment Count=====");
	    Map<String, Long> collect5 = employee2s.stream().filter(e->e.getDepartment().
	    		equals("IT")).collect(Collectors.groupingBy(Employee2::getGender,Collectors.counting()));
	         
	    System.out.println(collect5);
	    
	 
	    System.out.println("=====Average salary of male and female employess=====");
	    Map<String, Double> collect9 = employee2s.stream().collect(Collectors.groupingBy(Employee2::getGender,Collectors.averagingDouble(Employee2::getSalary)));
	    System.out.println(collect9);
	    
	
	    System.out.println("=====List Down the all employees in each department======");
	    Map<String, List<Employee2>> depWiseEmp = employee2s.stream().collect(Collectors.groupingBy(Employee2::getDepartment));
	    depWiseEmp.entrySet().forEach(e->{
	    	System.out.println("Department Name :"+e.getKey()+"\n \n Employees Name are: \n");
	    	e.getValue().stream().forEach(System.out::println);
	    }); 
	    
	    
	   
	    System.out.println("============Average Salary and total salary of whole organization=======");
	   
	    DoubleSummaryStatistics summaryStat = employee2s.stream().collect(Collectors.summarizingDouble(Employee2::getSalary));
	    System.out.println("The Average salary of whole org is :"+summaryStat.getAverage());
	    System.out.println("The total salary of whole org is :"+summaryStat.getSum());
	    
	    
	    
	    
	    System.out.println("====Seperate the employees who are younger than or equal to 25 years from \n"
	    		+ "those employees who are older than 25 years=============");
	   Map<Boolean, List<Employee2>> collect6 = employee2s.stream().collect(Collectors.partitioningBy(e->e.getAge()>25));

	   collect6.entrySet().stream().forEach(e->{
		   if(e.getKey())
		   {
			   System.out.println("The name of employees whose age is above 25 \n");
			   e.getValue().stream().forEach(System.out::println);
		   }
		   else {
			System.out.println("The name of employees whose age is below 25 are \n");
			e.getValue().stream().forEach(System.out::println);
		}		   
	   });	   
	  
	    System.out.println("\n==========FInding the oldest employee in the list ===========");
	    Employee2 maxAgeEMp = employee2s.stream().max(Comparator.comparing(Employee2::getAge)).get();
	    System.out.println(maxAgeEMp);
	    
	    
	 
	    System.out.println("========Higest paid salary in each departmnet emp details========");
	  
	    Map<String, Employee2> highestPaidSalInEachDep = employee2s.stream().collect(Collectors.
	    		groupingBy(Employee2::getDepartment,Collectors.
	    				collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee2::getSalary)), Optional::get)));	    
	    
          highestPaidSalInEachDep.entrySet().stream().forEach(e->{
        	  System.out.println("Department name :"+e.getKey());
        	  System.out.println(e.getValue());         	  
          });	    
	}	
}
