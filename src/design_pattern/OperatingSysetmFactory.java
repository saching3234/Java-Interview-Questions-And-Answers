package design_pattern;

public class OperatingSysetmFactory {
	//make the private constructor so that this class
	//object will not be created
	private OperatingSysetmFactory() {	}
	
	//create the public static method
	//that will retunr OS object back
	public static OperatingSystem getInstance(String type,String versin,String architecture) {
		switch (type) {
		case "WINDOWS":
			return new WindowsOsSystem(versin, architecture);
		case "LINUX":
			return new LinuxOsSystem(versin, architecture);
		default:
			throw new IllegalArgumentException("OS NOT SUPPORTED");
		}
	}	
	 public static void main(String[] args) {
		OperatingSystem os=OperatingSysetmFactory.getInstance("LINUX","1.0","32 BIT");	
	    os.changeDir("SACHIN");
	    os.removeDir("sachin");
	    System.out.println("OS VERSION IS:"+ os.getVersion());
	    System.out.println("OS ARCHITECTURE IS: "+ os.getArchitecture());
	    System.out.println(os.toString());
		
	}
	
}
