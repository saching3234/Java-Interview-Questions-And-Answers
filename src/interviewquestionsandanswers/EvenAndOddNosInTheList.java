package interviewquestionsandanswers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenAndOddNosInTheList {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,30,11,33,22,80);
		System.out.println("The Original List is :"+list);
     
		List<Integer> evenNoList = list.stream().filter(i->i%2==0).toList();

		System.out.println("Even no list: "+evenNoList);
        
		List<Integer> oddNoList = list.stream().filter(i->i%2==1).toList();
		System.out.println("Odd no list : "+oddNoList);
		
		System.out.println("-----using the collectors and partionBy method-----");
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(e->e%2==0));
        
		oddNoList=collect.get(false);
		evenNoList=collect.get(true);
		System.out.println("The Odd nos are :"+oddNoList);
        System.out.println("The even nos are : "+evenNoList);		
		
	}

}
