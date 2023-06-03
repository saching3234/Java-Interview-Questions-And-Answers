package mypackage;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
	public static void main(String[] args) {		
	
    Map<String, Integer> map = new HashMap<>();
	map.put("A", null);
	map.put(null, 1);
	map.put(null, 2);
	map.put(null, 9);
	map.put("A", 23);
	System.out.println(map);
	}
}
