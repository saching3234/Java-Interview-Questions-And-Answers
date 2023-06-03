package interviewquestionsandanswers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductOperations {
	
	public static void main(String[] args) {
		List<Product> products=new ArrayList<>();
		
		//adding the some products in the list
		products.add(new Product(101, "JAVA", "BOOK", 150));
		products.add(new Product(102, "SPRING BOOT", "BOOK", 250));
		products.add(new Product(103, "HTML", "BOOK", 170));
		products.add(new Product(104, "CSS", "BOOK", 350));
		
		products.add(new Product(105, "NOKIA", "PHONE", 150));
		products.add(new Product(106, "SAMSUNG", "PHONE", 250));
		products.add(new Product(107, "LENOVO", "PHONE", 350));
		//filter->find min price and get back that product
		System.out.println("--------FIND THE CHEAPEST PHONE IN THE PHONE CATEGORY--------");
		Product product = products.stream().filter(s->s.getCategory() .equals("PHONE")).min(Comparator.comparing(Product::getPrice)).get();
		
		
		System.out.println(product);
		//filter->find max price and get back that product
		System.out.println("===============================================================");
		System.out.println("--------FIND THE EXPENSIVE BOOK FROM THE BOOK CATEGORY----------");
		Product product2 = products.stream().filter(p->p.getCategory().equalsIgnoreCase("book")).max(Comparator.comparing(Product::getPrice)).get();
	    System.out.println(product2);
	    
	    System.out.println("===============================================================");
		System.out.println("--------FIND THE  BOOKS FROM THE BOOK CATEGORY WHOSE PRICE IS GREATER THAN 200 ----------");
	    List<Product> list = products.stream().filter(e->e.getCategory().equalsIgnoreCase("book")&&e.getPrice()>200).toList();
	    System.out.println(list);
	}

}
