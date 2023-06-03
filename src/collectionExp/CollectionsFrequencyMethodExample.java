package collectionExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFrequencyMethodExample {

		 public static void main(String[] args) {
		        // Create a list of integers
		        List<Integer> numbers = new ArrayList<>();
		        numbers.add(1);
		        numbers.add(2);
		        numbers.add(2);
		        numbers.add(3);
		        numbers.add(2);
		        numbers.add(4);
		        numbers.add(5);
		        numbers.add(3);

		        // Count the frequency of the number 2 in the list
		        int frequency = Collections.frequency(numbers, 3);

		        System.out.println("The frequency of the number 2 is: " + frequency);
		    }
	

}
