package real_time_interview_questions_answers;

public class MetagraphDigital {	
	
	
	
	 void m1() {
		
	   System.out.println(super.toString()	);
	}
	
	public static void main(String[] args) {
	
		int n=1234;
		int sum=0;
		int temp=0;
		while(n>0) {
			temp=n%10;
			sum+=temp;
			n=n/10;
		}		
		
		System.out.println(sum);		
		MetagraphDigital objDigital=new MetagraphDigital();
		objDigital.m1();
	}
}
