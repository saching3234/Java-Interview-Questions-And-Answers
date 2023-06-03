package real_time_interview_questions_answers;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Employee {

	private int empNo;
	private String name;
	private int sal;
	private String loc;		
	
}
