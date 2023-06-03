package interviewquestionsandanswers;

public class MethodOverloadingTrickyExamples {
    public void m1(int i){
        System.out.println("int-arg method");
    }
    
    /*
    public void m1(float i){
        System.out.println("float-arg method");
    }  
    */
    
    
    public void m1(Number n) {
    	System.out.println("The number block is called");
    }
	
    public void m1(int... n) {
    	System.out.println("The var args block is called");
    }
	
	public static void main(String[] args) {
		MethodOverloadingTrickyExamples t=new MethodOverloadingTrickyExamples();
        t.m1(10);
        t.m1(10.5f);
        t.m1('a');
        t.m1(1l);
        t.m1();
        t.m1(1,2,3);
        //double promotion is not possible so it will give error
        //t.m1(10.5);


	}
}
