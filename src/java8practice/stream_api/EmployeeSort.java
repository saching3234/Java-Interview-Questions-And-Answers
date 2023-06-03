package java8practice.stream_api;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {
	public static void main(String[] args) {
		List<Employee> employees = DataBase.getEmployees();
		Comparator<Employee> c = new EmpSort();
		System.out.println("=====sort using the traditional method=====");
		// using the traditional method
		Collections.sort(employees, c);
		
		System.out.println(employees);
		// using the anonymous class
		System.out.println("=====sort using the anonymous way=====");
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSal() - o2.getSal());
			}
		});
		System.out.println(employees);
		System.out.println("=====sort using the lambada method=====");
		//using the lambada expression
	    Collections.sort(employees,(o1,o2)->o1.getName().compareTo(o2.getName()));
        System.out.println(employees);
	}
}

//using the old method
class EmpSort implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o2.getSal() - o1.getSal());
	}
}