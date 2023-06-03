package shalow_and_deep_cloning;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address implements Cloneable{  
	String street;
	String pincode;	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
