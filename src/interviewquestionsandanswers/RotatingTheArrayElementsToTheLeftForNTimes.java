package interviewquestionsandanswers;

public class RotatingTheArrayElementsToTheLeftForNTimes {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=3;
		
		for(int i=0;i<n;i++) {
			int firstElem=arr[0],j;
			for( j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=firstElem;
		}
		
		for(int i:arr)
			System.out.print(i+" ");
	}
}
