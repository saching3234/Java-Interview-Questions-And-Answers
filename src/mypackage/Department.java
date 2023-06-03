package mypackage;

import java.net.SocketTimeoutException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
 
   private	int did;
	private String dname;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return did == other.did && Objects.equals(dname, other.dname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(did, dname);
	}



	
	
	
	
	
	public static void main(String[] args) {
		Department department=new Department(1,"it");
		Department department2=new Department(1,"it");
		Set<Department> hashSet=new HashSet<>();
		hashSet.add(department2);
		hashSet.add(department);
		
		System.out.println(hashSet);
	}









	






	






}
