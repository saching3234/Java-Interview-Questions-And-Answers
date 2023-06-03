package collectionExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import lombok.Builder;

@Builder
public class Person implements Comparable<Person>{
	private Integer pid;
	private String pname;

	public Person(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public Integer getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]\n";
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(pid, other.pid) && Objects.equals(pname, other.pname);
	}

	@Override
	public int compareTo(Person o) {
		if(pid==o.getPid())
			return 0;
		else if (pid<o.getPid())
			return -1;
		else
			return 1;
	}
	
	
	public static void main(String[] args) {
		Person person1=new Person(1,"sahil");
		Person person2=new Person(3,"sachin");
		Person person3=new Person(4,"shital");
		Person person4=new Person(10,"nana");
		
		List<Person> list=new ArrayList<>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		
		System.out.println(list);
		Collections.sort(list,new ComperatorPersonNameSort());
		System.out.println(list);
	}
	
	
}
