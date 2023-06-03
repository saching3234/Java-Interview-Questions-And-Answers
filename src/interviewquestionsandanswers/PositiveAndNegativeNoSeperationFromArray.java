package interviewquestionsandanswers;

public class PositiveAndNegativeNoSeperationFromArray {
	
	public static void main(String[] args) {
	  int a[]= {10,20,-30,-40,50,-60,70};
	  int posArr[]= new int[10],negArr[]=new int[10],possCount=0,negCount=0;
	  
	  for(int i:a) {
		 if(i<0)
			 negArr[negCount++]=i;
		 else 
			 posArr[possCount++]=i;
	  }
	  
	  System.out.println("The positive nos in the arrays are: "+possCount);
	  printArr(posArr,possCount);
	  

	  System.out.println("The negative nos in the arrays are: "+negCount);
	  printArr(negArr,negCount);	  
	}	
	
	//method for printing the array
	static void printArr(int arr[],int size) {
		for(int i=0;i<size;i++)
			System.out.println(arr[i]+"  ");
	}

}
