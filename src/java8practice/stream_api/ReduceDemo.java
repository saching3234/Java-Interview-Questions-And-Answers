package java8practice.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class ReduceDemo {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3,1,5,1,7,8,2,-10);
		List<String> stringsList=Arrays.asList("Sachin","Gawade","Nana","Ketan","Meghalaya");
		int sum=1;
		System.out.println("======Finding the sum using the old method=======");
		for(int l:list)
			sum+=l;
		System.out.println(sum);
		
		System.out.println("======The sum using the mapto method=======");
		int sum2 = list.stream().mapToInt(i->i).sum();
		System.out.println(sum2);
		
		System.out.println("========Sum using the reduce method==========");
		Integer reduceSum = list.stream().reduce(0,(a,b)->a+b);
		System.out.println(reduceSum);
		System.out.println("==========reduce sum with method reference========");
		Optional<Integer> reduceSumInteger=list.stream().reduce(Integer::sum);
		System.out.println(reduceSumInteger.get());
		System.out.println("========Multiplicarion using the reduce method==========");
		Integer reduce = list.stream().reduce(1,(a,b)->a*b);
		System.out.println("The multiplication of the arrys list is : ");
		System.out.println(reduce);
		System.out.println("==Fidning the max value in the list using the reduce=====");
		Integer reduceMax = list.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println(reduceMax);
		System.out.println("==Fidning the max value in the list using the method reference=====");
		Optional<Integer> reduceMaxWithMethodRef = list.stream().reduce(Integer::max);
		System.out.println(reduceMaxWithMethodRef.get());
		System.out.println("==Fidning the min value in the list using the reduce=====");
		Integer reduceMin = list.stream().reduce(1,(a,b)->a<b?a:b);
		System.out.println(reduceMin);
		System.out.println("Finding the longest string using the reduce method");
		Optional<String> reduce2 = stringsList.stream().reduce((s1,s2)->s1.length()>s2.length()?s1:s2);
		System.out.println(reduce2.get());
		//calculating the average salary of emp whose grade is A
		OptionalDouble average = DataBase.getEmployees().stream().filter(e->e.getGrade().
				equalsIgnoreCase("A")).map(Employee::getSal).mapToDouble(i->i).average();
		System.out.println("The average salary is : "+average.getAsDouble());
		
		double sum3 = DataBase.getEmployees().stream().filter(e->e.getGrade().
				equalsIgnoreCase("B")).map(Employee::getSal).mapToDouble(i->i).sum();
		System.out.println("The sum of b grade salary emps are :"+sum3);
		
	}

}
