package interviewquestionsandanswers;

public class BinarySearch {

	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6,7,8,90};
		binarySearch(a, 0, a.length-1,4);
	}
	
	static void binarySearch(int a[],int first,int last,int key) {		
		while(first<=last) {		
			//calculate the mid 
		     int mid=(first+last)/2	;
			//check the key is equal to mid element or not if yes print position and come out using break
		     if(a[mid]==key) {
		    	 System.out.println("Element found at location :"+(mid+1));
		    	 break;
		     }
		     else {
				if(a[mid]<key)
					first=++mid;
				else 
					last=--mid;
			}			
		}			
		//if first becomes the greater than last then element not present in the array
		if(first>last)
	    System.out.println("Sorry element not present in the list");
	}
}
