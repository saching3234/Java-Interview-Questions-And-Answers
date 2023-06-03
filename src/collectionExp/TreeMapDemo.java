package collectionExp;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<>();
		
		map.put(4, "Ketan");
		map.put(2, "Nana");
		map.put(3, "Rais");
		map.put(1, "sachin");
		map.put(10, "sachin");
		
		map.entrySet().stream().forEach(e->{
			System.out.println(e.getKey());
			System.out.print(" "+e.getValue());
		});
	}

}
