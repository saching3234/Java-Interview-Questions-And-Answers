package interviewquestionsandanswers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
  String name;
  Integer age;
  String diease;
  Integer amount;
  
  
@Override
public String toString() {
	return "\nPatient [name=" + name + ", age=" + age + ", diease=" + diease + ", amount=" + amount + "]";
}
  	
  
  
}
