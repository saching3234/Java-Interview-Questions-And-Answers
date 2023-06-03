package multi_threading;

import java.util.ArrayList;

class AddThread extends Thread{
	ArrayList a;
	
	public AddThread(ArrayList a) {
		this.a=a;
	}
	
	 public void run() {
	        for (int i = 0; i < 5; i++) {
	            synchronized (a) {
	                a.add("Item " + i);
	                System.out.println("Item added by add thread");
	                // Notify the RemoveThread after adding an item to the list
	                a.notify();
	            }
	        }
	    }
}

class RemoveThread extends Thread{
	ArrayList a;
	
	public RemoveThread(ArrayList a) {
	 this.a=a;
	}
	

    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (a) {
                while (a.isEmpty()) {
                    System.out.println("Waiting for add thread");
                    try {
                        a.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Removed -" + a.remove(0));
            }
        }
    }
}



public class WaitAndNotifyDemo {
	
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		AddThread t1=new AddThread(arrayList);
		RemoveThread t2=new RemoveThread(arrayList);
		t2.start();
		t1.start();
		
	}

}
