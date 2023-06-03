package mypackage;

import java.util.Objects;

class Person2{
	String name;
	String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person2 other = (Person2) obj;
		return Objects.equals(age, other.age) && Objects.equals(name, other.name);
	}
	*/
	
	
}


public class EqualsMethodDemo {
	
	public static void main(String[] args) {
		Person2 person=new Person2();
		person.setAge("20");
		person.setName("sachin");
		
		Person2 person2=person;
		person2.setAge("20");
		person2.setName("sachin");
		
		System.out.println(person.getClass());
		
		
	}

}
