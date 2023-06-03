package interviewquestionsandanswers;

import java.util.Optional;

public class OptionalOperations {

	public static void main(String[] args) {
		String s="";
		Optional<String> optional=Optional.ofNullable(s);
		//System.out.println(optional);
		
		if(optional.isPresent())
			System.out.println("The value in the optional is : "+optional.get());
		else
			System.out.println(optional.orElse("value not present in optional it is null value"));
	}
}
