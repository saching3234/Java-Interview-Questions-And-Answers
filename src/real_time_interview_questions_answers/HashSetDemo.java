package real_time_interview_questions_answers;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Employee> employees=new HashSet<>();
		
		employees.add(new Employee(1,"Sachin",20000,"pune"));
		employees.add(new Employee(2,"nana",30000,"pune"));
		employees.add(new Employee(3,"ketan",40000,"kolhapur"));
		employees.add(new Employee(4,"nana",50000,"mumbai"));
		employees.add(new Employee(1,"Sachin",20000,"pune"));
		
		System.out.println(employees);
	}
}
