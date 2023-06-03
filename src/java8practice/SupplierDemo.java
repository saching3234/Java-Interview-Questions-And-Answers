package java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String>{
	@Override
	public String get() {		
		return "Hello from the supplier interface's get method";
	}	
	
	public static void main(String[] args) {
		//traditional way
		Supplier<String> supplier=new SupplierDemo();
		System.out.println(supplier.get());
		//moder way
		Supplier<String> str=()-> "second way of supplier method creation";
		System.out.println(str.get());
		//actual application
		List<String> list=Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(supplier));
		System.out.println(list.stream().findAny().orElseGet(()->"No element present in the list"));
		
		Employee employee=Employee.builder().empId("e1").dep("IT").build();
		System.out.println(employee.toString());
		
	}
}
