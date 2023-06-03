package interviewquestionsandanswers;

import java.util.LinkedList;

public class ProducerConsumer {

	private LinkedList<Integer> list = new LinkedList<>();
	int value = 0;

	public void producer() throws InterruptedException {
		while (true) {
			synchronized (this) {
				// if list has the elements then wait for other thread to consume it
				while (list.size() > 0) 
					wait();

				// if list does not have data the produce the data
				System.out.println("Produced data: ");
				list.add(value);
				value++;

				// notify to other thread that value is produces
				notify();
				Thread.sleep(1000);
				
			}
		}
	}

	public void consumer() throws InterruptedException {
		while (true) {

			synchronized (this) {

				// check the list is empty or not if empty then wait
				while (list.size() == 0) 
					wait();

				// if list has data then extract the data from list
				int data = list.removeFirst();
				System.out.println("The consumed data is :" + data);
				// now notify other thread to produce the data
				notify();
				Thread.sleep(1000);
				
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {
		ProducerConsumer produceObj = new ProducerConsumer();
		// create a new thread
		Runnable runnable = () -> {
			try {
				produceObj.producer();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		};

		Thread t1 = new Thread(runnable);
	
		
		ProducerConsumer consumerObj = new ProducerConsumer();
		Runnable runnable2=()->{
			try {
				consumerObj.consumer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Thread t2=new Thread(runnable2);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

}
