package shalow_and_deep_cloning;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee implements Cloneable {
   private	String empCode;
   private	String name;
   private Address address;
   
  @Override
  protected Object clone() throws CloneNotSupportedException {
   Employee emp=(Employee)super.clone();
   //set the cloned address copy in the address
    emp.setAddress((Address) address.clone());
    return emp;
  }  
   
}
