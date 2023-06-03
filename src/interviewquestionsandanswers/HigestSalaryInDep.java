package interviewquestionsandanswers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HigestSalaryInDep {
   public static void main(String[] args) {
    List<Employee> employees=new ArrayList<>();
    Map<String,Integer> depMap=new HashMap<>();
    employees.add(new Employee("e1","Sachin","it",30000,22));
    employees.add(new Employee("e2","Mahesh","it",40000,33));
    employees.add(new Employee("e3","Rais","ce",50000,34));
    employees.add(new Employee("e4","Shital","ce",30000,21));    
    //go through the array list
    System.out.println("=======Using the old method===========");

    for (Employee employee : employees) {
		
    	if(!depMap.containsKey(employee.getDep())) {
    		depMap.put(employee.getDep(), employee.getSalary());
    	}
    	else if( depMap.get(employee.getDep())<employee.getSalary())
    		depMap.put(employee.getDep(), employee.getSalary());    	
	}
    
    System.out.println(depMap);
    
    
    
	//second approach     
   System.out.println("===Using the stream api group by method===="); 
   Comparator<Employee> compareBySal=Comparator.comparing(Employee::getSalary);
   Map<String, Optional<Employee>> collect = employees.stream().
		   collect(Collectors.groupingBy(Employee::getDep,Collectors.reducing(BinaryOperator.maxBy((e1,e2)->e1.getSalary()-e2.getSalary()))));
    
  System.out.println(collect); 
   
  //third approach
  System.out.println("===Using the stream api group by method second approach===="); 
  Map<String, Employee> collect2 = employees.stream().collect(Collectors.groupingBy(Employee::getDep,
		  Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));
  
    collect2.entrySet().stream().forEach(e->{
    	System.out.println("Dep Name: "+e.getKey());
    	System.out.print(e.getValue().toString());
    });

  
  System.out.println("=======third approach using the stream api=======\n");
  Map<String, Optional<Employee>> collect3 = employees.stream().collect(Collectors.groupingBy(Employee::getDep,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
  System.out.println(collect3);
  System.out.println("=================================================================\n\n");
  
  
  
  
  
  
  /*----------------Parallel and normal stream example-------------------------------*/
  long start; long end;
  start=System.currentTimeMillis();
  IntStream.rangeClosed(1, 10).forEach(i->System.out.println("The Cuurent thread name is: "+Thread.currentThread().getName()+" :"+i)) ;
  end=System.currentTimeMillis();
  System.out.println("The taken by main thread is :"+ (end-start));
  
  start=System.currentTimeMillis();
  IntStream.rangeClosed(1, 100).parallel().forEach(i->System.out.println("The parallel thread name is : "+Thread.currentThread().getName()+" :"+i));
  end=System.currentTimeMillis();
  System.out.println("The taken by paarallel thread is :"+ (end-start));   
  employees.stream().collect(Collectors.groupingBy(Employee::getDep,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),Optional::get)));  
  
   }
}
