package design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
private List<String> empList;
	
	public Employee(){
		empList = new ArrayList<String>();
	}
	

	public Employee(List<String> list){
		this.empList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		//deep cloning is used here because linked list is used as member	
		
		List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Employee(temp);
			
		 
	}
}
