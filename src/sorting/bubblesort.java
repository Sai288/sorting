package sorting;

import java.util.Scanner;

public class bubblesort
{
   public static void main(String args[])
   {
       int n, i, j, temp;
       int arr[] = new int[50];
       Scanner sc = new Scanner(System.in);
	   
       System.out.print("Enter  the no.of Elements : ");
       n = sc.nextInt();
	   
       System.out.print("Enter " +n+ " Numbers : ");
       for(i=0; i<n; i++)
       {
           arr[i] = sc.nextInt();
       }
	   
       System.out.print("Sorting Array\n");
       for(i=0; i<(n-1); i++)
       {
           for(j=0; j<(n-i-1); j++)
           {
               if(arr[j] > arr[j+1])
               {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
	   
       System.out.print("Array Sorted \n");
	   
       System.out.print("Sorted List in Ascending Order : \n");
       for(i=0; i<n; i++)
       {
           System.out.print(arr[i]+ "  ");
       }
   }
}