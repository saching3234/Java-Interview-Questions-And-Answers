package interviewquestionsandanswers;


class Parent{
	
	void test(int a) {
		System.out.println("parent Test int method called :"+ a);
	}
	
	void test(Number a) {
		System.out.println("parent Number method called "+a);
	}
}

public class ChildClass  extends Parent{
	
	void test(Number a) {
		System.out.println("child Number method called "+a);
	}
	
	void test(int a) {
		System.out.println("child int method called "+a);
	}
	
	
	public static void main(String[] args) {
		Parent parent=new Parent();
		parent.test(10);
		parent.test(10.0);
		
		Parent c=new ChildClass();
		c.test(11);
		c.test(10.11);
		c.test(10.0);
		//child class can't hold the parent class object ref
		//ChildClass childClass=new Parent();
	}

}
