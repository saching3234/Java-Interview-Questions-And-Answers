package mypackage;



public class ArraySorting {
	
	public static void main(String[] args) {
		int a[]= {2,4,12,3,55};
	     int temp;
	   //using the selection sort
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					//swap
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i:a)
			System.out.print(i+" ");
	 	
		//second highest no
		System.out.println("\nsecond highest no");
		System.out.println(a[a.length-2]);
	}
	
	
	
	

}
