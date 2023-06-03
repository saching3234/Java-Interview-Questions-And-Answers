package collectionExp;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		Person person=new Person(1, "Sachin");
		Person person2=new Person(1, "Sachin");
		Set<Person> set=new HashSet<Person>();
		set.add(person2);
		set.add(person);	
		set.add(Person.builder().pid(1).pname("Sachin").build());
		System.out.println(set);
		System.out.println(person.hashCode());
		System.out.println(person2.hashCode());
		
		System.out.println("the size of the set is ");
		
	}
}
