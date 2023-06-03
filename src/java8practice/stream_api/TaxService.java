package java8practice.stream_api;


import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

	static List<Employee> evaluateTaxUsers(String tax){
		
		return (tax.equalsIgnoreCase("tax"))?
				DataBase.getEmployees().stream().filter(e->e.getSal()>50000).collect(Collectors.toList()):
					DataBase.getEmployees().stream().filter(e->e.getSal()<=50000).collect(Collectors.toList());
	}
	
	
	public static void main(String[] args) {
		System.out.println(evaluateTaxUsers("non tax"));
	}
}
