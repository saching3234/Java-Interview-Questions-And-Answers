package collectionExp;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread{
	static Map<Integer, String> map=new ConcurrentHashMap();
	
	public void run() {
		
		//slepping the thread for one minute
		try {
			Thread.sleep(1000);
			//add the new item in the hashmap while other thread is operating on it
			map.put(3,"this value is added by the user defined thread");
			System.out.println("User defined thread has added the value in map successfully");
		} catch (InterruptedException e) {
			 System.out.println(e.getMessage());
		}		
	}
	
	public static void main(String[] args) throws InterruptedException {
		ConcurrentHashMapDemo cm=new ConcurrentHashMapDemo();
		map.put(1, "The value is added by the main thread 1");
		map.put(2, "The value is added by the main thread 2");
		map.put(4, "The value is added by the main thread 4");	
		map.put(null, null);
		//starting the thread		
		cm.start();
		//traversing through the map
	   for(Object o:map.entrySet()) {
		   System.out.println(o);
		   Thread.sleep(2000);
	   }
	   
	   System.out.println("\n\n"+map);		
	}
}
