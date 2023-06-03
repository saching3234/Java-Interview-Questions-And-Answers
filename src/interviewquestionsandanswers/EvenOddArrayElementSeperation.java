package interviewquestionsandanswers;

public class EvenOddArrayElementSeperation {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,9};
		int index=0;
		int evenCount=0,oddCount=a.length-1;
		
		int newArrr[]=new int[a.length];
		
		for(int i:a)
		{
			if(i%2==0)
				newArrr[index++]=i;
		}
		
		for(int i:a) {
			if(i%2!=0)
				newArrr[index++]=i;
		}
		
		for(int i:newArrr)
			System.out.print(i+" ");		
		
		//second approach
		for(int i:a)
		{
			if(i%2==0)
				newArrr[evenCount++]=i;
			else
				newArrr[oddCount--]=i;
		}
		
		System.out.println("---------------Using Second Approach----------");
		for(int i:newArrr)
			System.out.print(i+" ");
		
	}
}
