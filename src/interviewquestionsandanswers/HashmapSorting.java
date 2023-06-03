package interviewquestionsandanswers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashmapSorting {
	
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("a", 2);
		map.put("b", 1);
		map.put("e", 8);
		map.put("q", 3);		
		List<Entry<String, Integer>> collect = map.entrySet().stream().sorted((e1,e2)->e1.getValue()-e2.getValue()).collect(Collectors.toList());
        
		System.out.println(collect);
		
	}

}
