package interviewquestionsandanswers;

public class ArmostrongNoChecking {	
	//Arm strong no is the one whose each digit power and sum of all power are equal to original no
	//of original no .   
	public static void main(String[] args) {
	  int n=88593477;
	  int len= Integer.toString(n).length();
	  int sum=0;
	  int temp=n;
	  
	  while(temp!=0) {
		  int rem=temp%10;
		  sum+=Math.pow(rem, len);
		  //remove the last digit
		  temp=temp/10;
	  }
	  
	  //checking the with original no
	  if(sum==n)
		  System.out.println("The given no is armstrong no");
	  else
		  System.out.println("No is not armstong no sorry  ......");	  
	}
}
