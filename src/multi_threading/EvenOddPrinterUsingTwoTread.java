package multi_threading;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrinterUsingTwoTread {
   public static Object object=new Object();
   private static IntPredicate evenPred=e->e%2==0;
   private static IntPredicate oddPred=o->o%2!=0;
   
   //method for printing the nos
   static void printNos(int no) throws InterruptedException {
	   synchronized (object) {
		System.out.println("The current thread name is : "+Thread.currentThread().getName()+" : "+no);
		object.notify();
		object.wait();
		}
   }
   
   //1-10 stream method for interation
   static void oneToTen(IntPredicate i) {
	   IntStream.rangeClosed(1, 5).filter(i).forEach(value -> {
		try {
			printNos(value);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	});
   }   
	
	public static void main(String[] args) throws InterruptedException {		
		CompletableFuture.runAsync(()->EvenOddPrinterUsingTwoTread.oneToTen(oddPred));
		CompletableFuture.runAsync(()->EvenOddPrinterUsingTwoTread.oneToTen(evenPred));
		Thread.sleep(1000);
		
	}
}
