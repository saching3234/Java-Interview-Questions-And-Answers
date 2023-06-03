package interviewquestionsandanswers;

import java.util.stream.IntStream;

public class SkipAndLimitMethods {

	public static void main(String[] args) {
		//skip & limit example (2-9)

		IntStream.rangeClosed(1, 30).skip(1).limit(20).forEach(System.out::println);
	}
}
