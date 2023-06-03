package design_pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class OperatingSystem {
	
	private String version;
	private String architecture;
	
	

	//abstract methods to be implemented by class who extends this
	public abstract void changeDir(String dir);
	
	public abstract void removeDir(String dir);
}
