package java8practice.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDB {

	public static List<Customer> getCustomers() {
		
		return Stream.of(
               new Customer(101,"sachin","sachin@gmail.com",Arrays.asList("998822334455","8877223311")),
               new Customer(102,"sneha","sneha@gmail.com",Arrays.asList("998822334499","8877223344")),
               new Customer(103,"sachin","satish@gmail.com",Arrays.asList("998822334412","8877223389"))
				).collect(Collectors.toList());
	}
}
