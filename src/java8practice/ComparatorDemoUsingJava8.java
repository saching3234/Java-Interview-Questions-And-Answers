package java8practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemoUsingJava8 {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee("e1","Sachin","IT",31));
		employees.add(new Employee("e2","Shital","IT",25));
		employees.add(new Employee("e3","Nana","ME",75));
		employees.add(new Employee("e4","Ketan","CE",21));
		
		//sort using the collections sort method
        //collection.sort method takes the compare method of comparator interface 
       //comparator is the functional interface
	   Collections.sort(employees,(e1,e2)->e1.getAge().compareTo(e2.getAge()));
	   System.out.println(employees);
		
	}
}
