package mypackage;

public class StringDemo {

	public static void main(String[] args) {
		String string1 =new String("java");
		String string2=new String("JAVA");
		String string3="java";
		System.out.println(string1);
		System.out.println(string1);		
		System.out.println(string1==string2);
		
		System.out.println(string1.intern().equals(string3));
		person person=new person();
		person.show();
		System.out.println(person);
	}
}

 class person{
	private String name;
	
	void show() {
		System.out.println(name);
	}
}
