package real_time_interview_questions_answers;

class A{
	int a=10;
	

	void abc(int aa) {
		System.out.println("method in A called "+a);
	}
	

}

class B extends A{
	int a=10;

	
	void abc(int a) {
		System.out.println("method in b called "+a);
	}
	
	
}

public class LtiMindTree_2_Round {

	
	public static void main(String[] args) {
     
		A aa=new B();
		aa.abc(100);
	}
}
