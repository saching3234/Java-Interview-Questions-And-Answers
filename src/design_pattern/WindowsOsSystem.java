package design_pattern;

public class WindowsOsSystem extends OperatingSystem {

	public WindowsOsSystem(String version, String architecture) {
		super(version, architecture);
		
	}

	@Override
	public void changeDir(String dir) {
		System.out.println("This is windows os with change dir method :"+dir);
		
	}

	@Override
	public void removeDir(String dir) {
		System.out.println("This is windows os with remove dir method :"+dir);
		
	}	
	
}
