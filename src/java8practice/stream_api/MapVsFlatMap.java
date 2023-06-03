package java8practice.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
	
	public static void main(String[] args) {
		List<Customer> customers=CustomerDB.getCustomers();
		List<String> emails=new ArrayList<>();
		System.out.println("=============orignal list =================");
		System.out.println(customers);
		emails=customers.stream().map(Customer::getEmail).collect(Collectors.toList());
		
		System.out.println("\nThe list of emails from the customer list :\n"+emails);
		System.out.println("\n========The phones using the map function=========");
	     List<List<String>> collect = customers.stream().map(Customer::getPhoneNos).collect(Collectors.toList());
	     System.out.println(collect);
	     
	     System.out.println("\n========The phone no using the flat mao =========");
		List<String> collect2 = customers.stream().flatMap(custor->custor.getPhoneNos().stream()).collect(Collectors.toList());
	    System.out.println(collect2);	
	}
}
