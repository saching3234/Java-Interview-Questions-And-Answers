package interviewquestionsandanswers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee2 {
	private Integer empId;
	private String name;
	private String gender;
	private String department;
	private Double salary;
	private Integer age;
	private Integer yearOfJoining;
	
	//toString method
	@Override
	public String toString() {
		return " Employee2 [empId=" + empId + ", name=" + name + ", gender=" + gender + ", department=" + department
				+ ", salary=" + salary + ", age=" + age + ", yearOfJoining=" + yearOfJoining + "]\n";
	}
	
}
