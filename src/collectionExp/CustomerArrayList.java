package collectionExp;

import java.util.ArrayList;
import java.util.List;

public class CustomerArrayList extends ArrayList{	
	@Override
	public boolean add(Object o) {
		if(this.contains(o))
			return true;
		else
			return super.add(o);
	}
	
	public static void main(String[] args) {
	  List list=new CustomerArrayList();
	  list.add(1);
	  list.add(1);
	  list.add(2);	  
	  System.out.println(list);
	  
	  
	}
}
