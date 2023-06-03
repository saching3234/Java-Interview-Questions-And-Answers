package interviewquestionsandanswers;

import java.util.StringJoiner;

public class StringJoinerDemo {
	
	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(",");
		sj.add("a").add("b").add("c");
		System.out.println(sj);
		StringJoiner sj2=new StringJoiner(":");
		sj2.add("d");
		sj2.add("e");
		System.out.println(sj2);
		//merge the two string now with the first string
		sj.merge(sj2);
		System.out.println(sj);
	}

}
