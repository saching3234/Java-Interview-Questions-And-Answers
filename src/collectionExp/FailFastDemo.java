package collectionExp;


import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastDemo {
	public static void main(String[] args) {
     CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
     list.add(12);
     list.add(23);
     list.add(90);
     list.add(123);
     list.add(78);
		
		
     for(Integer a:list) {
    	 System.out.println(a);
    	 list.add(77);   	 
     }
     
		System.out.println(list);
	}

}
