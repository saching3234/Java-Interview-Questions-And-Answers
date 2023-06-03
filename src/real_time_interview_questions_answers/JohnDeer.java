package real_time_interview_questions_answers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


@FunctionalInterface
interface MyInterface{
	void m1();
}


class Parent{
	
	void p1() throws Exception{
		System.out.println("method p1 called");
	}
}

class child extends Parent{
	
	void p1() throws IOException{
		System.out.println("method p1 called in child");
	}
}




public class JohnDeer {	
	
	public static void main(String[] args) throws Exception {
		List<Employee> list=new ArrayList<>();
		list.add(Employee.builder().empNo(1).name("sachin").sal(1000).loc("pune").build());
		list.add(Employee.builder().empNo(2).name("shital").sal(2000).loc("mumbai").build());
		list.add(Employee.builder().empNo(3).name("nana").sal(3000).loc("satar").build());
		list.add(Employee.builder().empNo(4).name("mahesh").sal(4000).loc("mumbai").build());
		
		//get the emp details whose name start with the s
		List<Employee> list2 = list.stream().filter(e->e.getName().startsWith("s")).toList();
		System.out.println(list2);
		
	    //get the salary of emps whose name start with the 's'	
	    DoubleSummaryStatistics collect = list.stream().filter(e->e.getName().startsWith("s")).collect(Collectors.summarizingDouble(e->e.getSal()));		
	    System.out.println(collect.getSum());	
	    
	    //functional interface implementation
	    MyInterface myInterface=()->System.out.println("m1 method called");
	    myInterface.m1();	    
	    
	    Parent parent=new child();
	    parent.p1();
	}
}
