package design_pattern;

public class LinuxOsSystem extends OperatingSystem{

	public LinuxOsSystem(String version, String architecture) {
		super(version, architecture);
		
	}

	@Override
	public void changeDir(String dir) {
		
		System.out.println("Linux is change dir method  :"+dir);
	}

	@Override
	public void removeDir(String dir) {
		System.out.println("Linux is remove  dir method  :"+dir);
		
	}

}
