package interviewquestionsandanswers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.sound.midi.Soundbank;

public class CountingElementUsingOldMethod {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,1,2,3,8,9,11};
		count(a);
	}
	
	
	
	static void count(int a[]) {
		Map<Integer, Integer> map=new HashMap<>();
		
		for(int x:a) {
			//if element already present in the map then increase the count
			if(map.containsKey(x))
				map.put(x, map.get(x)+1);
			else
				map.put(x, 1);
		}
		
		
		//printing the map result
		 for(Entry<Integer, Integer> entry:map.entrySet())
		 {   if(entry.getValue()>1)
			 System.out.println(entry.getKey()+" : "+entry.getValue());
		 }
		
		 //counting the duplicate using the stream api
		Map<Integer, Long> collect = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    System.out.println("Row result:");
		System.out.println(collect);
		System.out.println("The element whose reparted twice are printed below:\n");
		collect.entrySet().stream().forEach(e->{
			if(e.getValue()>1)
				System.out.println(e.getKey()+" :"+e.getValue());
		});
	}
}
