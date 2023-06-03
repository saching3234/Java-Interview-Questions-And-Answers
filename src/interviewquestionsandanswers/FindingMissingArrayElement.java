package interviewquestionsandanswers;

public class FindingMissingArrayElement {
	
	public static void main(String[] args) {
	  int	a[] = {1, 2,4,5,6};
      int arrSum=0;
      int n=a.length+1;    //+1 is used for missing element
      int actualSum=n*(n+1)/2;
	  
      //calculate the present array sum
      for(int x:a)
    	  arrSum+=x;
       
      System.out.println("the missing element is: "+(actualSum-arrSum));

   }
}
