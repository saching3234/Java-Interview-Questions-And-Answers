package java8practice.stream_api;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	int id;
	private String name;
	private String email;
	private List<String> phoneNos;
	@Override
	public String toString() {
		return "\n Customer [id=" + id + ", name=" + name + ", "
				+ "email=" + email + ", phoneNos=" + phoneNos + "]";
	}
}
