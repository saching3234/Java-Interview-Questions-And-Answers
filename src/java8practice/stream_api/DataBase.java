package java8practice.stream_api;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	public static List<Employee> getEmployees(){
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee(101, "Sachin", 70000,"A"));
		employees.add(new Employee(102, "Samiksha", 42000,"A"));
		employees.add(new Employee(103, "Ketan", 48000,"B"));
		employees.add(new Employee(104, "Shital", 51000,"B"));
		employees.add(new Employee(105, "Nana", 65000,"C"));
		return employees;
	}
}
