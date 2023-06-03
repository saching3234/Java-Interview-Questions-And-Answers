package collectionExp;

import java.util.Comparator;

public class ComperatorPersonIdSort implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return (o1.getPid()==o2.getPid())?0:(o1.getPid()<o2.getPid())?-1:1;
	}

}
