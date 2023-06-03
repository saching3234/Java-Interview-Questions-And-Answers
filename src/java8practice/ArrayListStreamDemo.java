package java8practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListStreamDemo {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		list.add(new Employee("e1", "Sachin", "IT", 20));
		list.add(new Employee("e2", "Shital", "EEE", 30));
		list.add(new Employee("e3", "Nana", "CE", 25));
		list.add(new Employee("e4", "Rais", "IT", 40));

		// traversing the list using the stream
		System.out.println("Traversing using the stream and foreach");
		list.stream().forEach(System.out::print);

		// filter usage
		list.stream().filter(e -> e.getAge() > 27).forEach(System.out::print);
		// collecting in the local variable
		List<Employee> collect1 = list.stream().filter(e -> e.getAge() > 27).collect(Collectors.toList());

		// sorting the list by age
		System.out.println("\n Emp List afetr sorting by age");
		// sorting using the stream
		list.stream().sorted((i1, i2) -> i2.getAge().compareTo(i1.getAge())).forEach(System.out::print);
		// collecting in the local list
		List<Employee> collect2 = list.stream().sorted((i1, i2) -> i1.getAge().compareTo(i2.getAge()))
				.collect(Collectors.toList());

		// taking the result in the new array list
		List<Employee> collect = list.stream().sorted((i1, i2) -> i1.getAge().compareTo(i2.getAge()))
				.collect(Collectors.toList());
		System.out.println("\n\nCollected list\n\n ");
		System.out.println(collect);

		// using the map function for increase the age of every emp by 5
		System.out.println("Ages of each emp increased by 5 \n");
		list.stream().map(e -> {
			e.setAge(e.getAge() + 5);
			return e;
		}).forEach(System.out::print);
		// collecting in the local list
		// map will make a changes in the orignal list
		List<Employee> collect3 = list.stream().map(e -> {
			e.setAge(e.getAge() + 5);
			return e;
		}).collect(Collectors.toList());
		System.out.println("\n\nLocally collected variable response");
		System.out.println(collect3);
	}
}
