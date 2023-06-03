package java8practice.stream_api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	Integer id;
	String name;
	Integer sal;
	String grade;
	
	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", sal=" + sal+"/ grade= "+grade + "]";
	}

	public Employee(int i, String string, int j) {
		this.id=i;
		this.name=string;
		this.sal=j;
	}
	
}
