package collectionExp;

import java.util.HashMap;
import java.util.Map;





public class HashMapDemo {

	 public HashMapDemo() {
		super();	
	}
	 
	void m1() {	
	}
	
   public static void main(String[] args) {
	Map<String, Integer> map=new HashMap<>();	
	map.put("a", 1);
	map.put("a", 2);
	map.put("b", 3);
	map.put("c", 4);
	map.put(null, null);
	map.put(null, 10);
	System.out.println(map);	
	final int a;
	a=10;
   }	
}
