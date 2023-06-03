package java8practice.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.IntStream;




public class ParallelStreamDemo implements Callable<Integer>{

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		IntStream.range(1, 10).forEach(i->System.out.println(i+ " The thread name of normal stream is "+Thread.currentThread().getName()));
		Long end=System.currentTimeMillis();
		System.out.println("The time taken by normal stream is :"+(end-start));
		
		start=end=0L;
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		 start=System.currentTimeMillis();
		 list.parallelStream().forEach(i->System.out.println(i+ " The thread name of normal stream is "+Thread.currentThread().getName()));
		 end=System.currentTimeMillis();
		System.out.println("The time taken by parallel stream is :"+(end-start));		
		System.out.println(new ParallelStreamDemo().call());
	}

	@Override
	public Integer call() {
		return 10/2;
	}
}
