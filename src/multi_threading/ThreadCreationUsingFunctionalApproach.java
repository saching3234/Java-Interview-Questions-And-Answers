package multi_threading;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ThreadCreationUsingFunctionalApproach {

	public static void main(String[] args) throws InterruptedException {
		Runnable run=()->{
			for(int i=0;i<5;i++)
			{
				System.out.println("hello from the functional interface :"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("My Thread name is : "+Thread.currentThread().getName());
			}
		};
		
		Thread thread=new Thread(run,"Thread using functional interface");
		thread.start();
		Thread.sleep(1000);
		System.out.println("Main thread name :"+Thread.currentThread().getName());		
		
	}
	
}
