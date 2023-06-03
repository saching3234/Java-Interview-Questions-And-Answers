package design_pattern;

import java.util.List;

public class PrototypeDesignPAttern {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emps = new Employee();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employee clonedEmp = (Employee) emps.clone();
	System.out.println(emps.hashCode());
	System.out.println(clonedEmp.hashCode());
		List<String> list = clonedEmp.getEmpList();
		list.add("John");
		list.add("Adding new item in the cloned");
	
		
		System.out.println("orignal emps List: "+emps.getEmpList());
		System.out.println("cloned emps  List: "+list);
	
	}
}
