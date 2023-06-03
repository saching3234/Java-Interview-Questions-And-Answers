package interviewquestionsandanswers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PatientStreamOperations {
	
	public static void main(String[] args) {
		List<Patient> patients=new ArrayList();
		
		patients.add(new Patient("p1", 20, "corona", 10000));
		patients.add(new Patient("p2", 30, "corona", 20000));
		patients.add(new Patient("p3", 40, "fever", 8000));
		patients.add(new Patient("p4", 10, "corona", 30000));
		
		System.out.println("---Print the list of employees who have corona and age is >10");
		
		 List<Patient> list = patients.stream().filter(s->s.getDiease() .equals("corona")&&s.getAge()>10).toList();
		System.out.println("-----print the average bill paid by the corona customers--------");
		System.out.println(list);
		Double collect = patients.stream().filter(s->s.getDiease().equals("corona")).collect(Collectors.averagingDouble(Patient::getAmount));
		System.out.println("the average amt paid by corona customer is :"+collect);
	}

}
