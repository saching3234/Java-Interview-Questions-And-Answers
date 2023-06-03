package real_time_interview_questions_answers;

import java.util.HashMap;
import java.util.Map;

public class Infosisys {
	
	public static void main(String[] args) {
		
		//guess the output
		Map<String,Integer> map1 = new HashMap();
		String str1 = "Hello";
		map1.put(str1,1);
		String str2 = new String("Hello");
		map1.put(str2,2);
		String str3 = new String("Hello");
		map1.put(str3,3);
		System.out.println(map1.size());      //1
		System.out.println(map1.get("Hello"));      //3
		System.out.println(map1.get(new String("Hello")));   //3
		System.out.println(str1.equals(str2));   //true
		System.out.println(str2.equals(str3));   //true
		System.out.println(str1.equals(str3));    //true
	}
}
