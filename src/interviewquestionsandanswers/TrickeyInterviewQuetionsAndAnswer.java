package interviewquestionsandanswers;

import java.util.Collections;

import javax.sound.midi.VoiceStatus;

public class TrickeyInterviewQuetionsAndAnswer extends Thread{

	public void run() {
		System.out.println("Inside the run");
	}
	
	static void print(Object o) {
		System.out.println("object method");
	}
	
	static void print(String o) {
		System.out.println("string method");
	}
	
	//main method overloaded
	public static void main(int ...o) {
		System.out.println("second main method");
		int n=o.length;
		for(int i:o)
		System.out.println(i);
	}
	
	public static void main(String args[]) {
		TrickeyInterviewQuetionsAndAnswer t1=new TrickeyInterviewQuetionsAndAnswer();
		t1.start();
		t1.stop();
		main(1,2,3,45,6);
		//we can't start the stopped thread again it will throws java.lang.IllegalThreadStateException
		//t1.start();
		//t1.stop();
		
		
		print(null);
		
		//break cannot be used outside of a loop or a switch
		if(true) {
		//	break;
		}
		
		for(int i=0;;i++) {
			
			break;
		}
		
		String a="abc";
		String b="abc";
		a.concat(b);
		System.out.println(a);		
		Demo5 demo5=new Demo5();
		System.out.println(demo5.x+" "+demo5.y);
		System.out.println();
		
		//Test test=new Test();
		
		System.out.println("cloud tech "+15*30);
		System.out.println(15*30+"cloud tech");
		
		System.out.println("cloud tech "+30/15);
		System.out.println(30/15+"cloud tech");
		
		System.out.println("cloud tech "+15+30);
		System.out.println(15+30+"cloud tech");
		
	}
}


class Test{
private static int counter =0;

	void Test() {
		counter=20;
	}
	
	Test(int n){
		counter=n;
	}
	
}


class Demo5{
	protected int x,y;
	
	
}