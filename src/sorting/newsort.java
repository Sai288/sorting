package sorting;

import java.util.Scanner;
public class newsort
{
    public static void main(String[] args) 
    {
    	int c, t;
    	
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        c = sc.nextInt();
    
        int num[] = new int[c];
        System.out.println("Enter array elements:");
        for (int i = 0; i < c; i++) 
        {
            num[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < c; i++) 
        {
            for (int j = i + 1; j < c; j++) { 
                if (num[i] > num[j]) 
                {
                    t = num[i];
                    num[i] = num[j];
                    num[j] = t;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < c - 1; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[c - 1]);
    }
}