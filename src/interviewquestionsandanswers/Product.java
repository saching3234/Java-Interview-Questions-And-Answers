package interviewquestionsandanswers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
private Integer id;
private String name;
private String category;
private Integer price;
@Override
public String toString() {
	return "\n Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "] \n";
}




}
