package shalow_and_deep_cloning;

public class EmployeeDeepCopy {	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address=Address.builder().street("patas").pincode("412219").build();
		Employee orignalEmployee=Employee.builder().empCode("e1").name("sachin").
				address(address).build();
		Employee clonedEmployee=(Employee)orignalEmployee.clone();
		System.out.println("Original Emp: \n"+orignalEmployee);
		
		clonedEmployee.getAddress().setStreet("pune");
		clonedEmployee.getAddress().setPincode("412220");
	
		System.out.println("Cloned Emp : \n"+clonedEmployee);
		System.out.println("Original after cloned updated Emp: \n"+orignalEmployee);
	}
}
