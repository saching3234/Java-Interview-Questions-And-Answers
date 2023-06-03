package java8practice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
	private String empId;
	private String name;
	private String dep;
	private Integer age;

	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", name=" + name + ", dep=" + dep + ", age=" + age + "]";
	}

}
