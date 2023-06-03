package shalow_and_deep_cloning;

import java.util.ArrayList;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeShalow implements Cloneable{	
	int eid;
	String name;
	String depName;	
	public static void main(String[] args) throws Exception {
		EmployeeShalow orignalEmp=EmployeeShalow.builder().eid(1).name("sachin").depName("IT").build();
		EmployeeShalow clonedemp=(EmployeeShalow) orignalEmp.clone();
		clonedemp.setDepName("ME");
		clonedemp.setName("Nana");
		
		System.out.println("cloned emp object \n");
		System.out.println(clonedemp);
		System.out.println("\nAfter adding the details in the cloned object now orignal objects is :\n");
		System.out.println(orignalEmp);
		
	}
}
