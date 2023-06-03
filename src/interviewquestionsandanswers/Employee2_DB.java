package interviewquestionsandanswers;

import java.util.ArrayList;
import java.util.List;

public class Employee2_DB {
	static List<Employee2> employees=new ArrayList<Employee2>();
	
	public static List<Employee2> getListOfEmployees() {
		employees.add(new Employee2(111, "sachin", "male", "IT", 80000.0, 30, 2016));

		employees.add(new Employee2(112, "shital", "female", "finance", 40000.0, 28, 2018));

		employees.add(new Employee2(113, "nana", "male", "mech", 45000.0, 25, 2020));

		employees.add(new Employee2(114, "ketaki", "female", "IT", 30000.0, 28, 2021));

		employees.add(new Employee2(115, "samiksha", "female", "finance", 10000.0, 20, 2022));

		employees.add(new Employee2(116, "komal", "female", "finance", 20000.0, 24, 2020));

		employees.add(new Employee2(117, "mahesh", "male", "mech", 34000.0, 30, 2016));

		employees.add(new Employee2(118, "rais", "male", "mech", 43000.0, 27, 2018));

		employees.add(new Employee2(119, "gopal", "male", "IT", 10000.0, 29, 2017));

		employees.add(new Employee2(120, "sachin", "male", "eee", 50000.0, 30, 2022));
		
		employees.add(new Employee2(121, "ramesh", "male", "eee", 80000.0, 35, 2015));	
		return employees;
	}
}
