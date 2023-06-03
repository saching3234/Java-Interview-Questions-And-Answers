package real_time_interview_questions_answers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TheIntechGroup {
	
	public static void main(String[] args) {
		String name="sachin gawade sachin";
		
		//count the each words        
		Map<String, Long> collect = Arrays.stream(name.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee(1,"Sachin",20000,"pune"));
		employees.add(new Employee(2,"nana",30000,"pune"));
		employees.add(new Employee(3,"ketan",40000,"kolhapur"));
		employees.add(new Employee(4,"nana",50000,"mumbai"));
		
		//filter out the pune based emps and increase their salary by 10%
		List<Integer> collect2 = employees.stream().filter(e->e.getLoc().equals("pune")).map(e->e.getSal()*110/100).collect(Collectors.toList());
		System.out.println("\n"+collect2);
	}
}
