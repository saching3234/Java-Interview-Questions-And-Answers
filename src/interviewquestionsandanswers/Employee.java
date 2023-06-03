package interviewquestionsandanswers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
   
	private String empId;
	private String name;
	private String dep;
	private Integer salary;
	private Integer age;
	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", name=" + name + ", dep=" + dep + ", salary=" + salary + ", age=" + age
				+ "]";
	}
	
	
	
	
  
}
