package collectionExp;

import java.util.Comparator;

public class ComperatorPersonNameSort implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getPname().compareTo(o2.getPname());
	}

}
