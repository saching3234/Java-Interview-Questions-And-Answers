package real_time_interview_questions_answers;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCountingInString {

	public static void main(String[] args) {
		String fruitNameString="apple";
		
		Map<Character, Integer> charCountMap=new LinkedHashMap<>();
		
		for(char c:fruitNameString.toCharArray()) {
			//updating current char the count of character in the map
			
			charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
			System.out.println(c+": "+charCountMap.getOrDefault(c, 0));
		}
		
		
		System.out.println("The count of the each character in apple string is");
		System.out.println(charCountMap);

	}

}
