package mypackage;

import java.util.Scanner;  

public class SelectionSortExample2  
{  
   public static void main(String args[])  
   {  
       int size, i, j, temp;  
       int arr[] = {2,3,4,1,1,6};
       size=arr.length;
       /*
       Scanner scan = new Scanner(System.in);  
         
       System.out.print("Enter Array Size : ");  
       size = scan.nextInt();  
         
       System.out.print("Enter Array Elements : ");  
       for(i=0; i<size; i++)  
       {  
           arr[i] = scan.nextInt();  
       }  
         */
       System.out.print("Sorting Array using Selection Sort Technique..\n");  
       for(i=0; i<size; i++)  
       {  
           for(j=i+1; j<size; j++)  
           {  
               if(arr[i] > arr[j])  
               {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }  
           }  
       }  
         
       System.out.print("Now the Array after Sorting is :\n");  
       for(i=0; i<size; i++)  
       {  
           System.out.print(arr[i]+ "  ");  
       }  
   }  
}