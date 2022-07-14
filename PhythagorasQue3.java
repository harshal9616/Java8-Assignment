package assignment;

import java.util.Scanner;

public class PhythagorasQue3 {
	
	 public static void main(String[] args)  
    { 
    	System.out.println("Enter array size");
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array Elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = sr.nextInt();
        }
        int a,b,c;
        int flag=0;
        for(int i=0;i<n-2;i++)//select an element
        {
            for(int j=i+1;j<n-1;j++)//select an element in front of the considered element
            {
                for(int k=i+2;k<n;k++)// this element will be one ahead of the previously selected element in the jus touter loop
                {
                  a = arr[i];
                  b = arr[j];
                  c = arr[k];
                  if(a*a + b*b == c*c) 
                	// if the chosen elements satisfy the pythagoras theorem then simply print the three values.
                    System.out.println(a +"  "+b+"  "+c);
                
                 flag++;
                   
                }
                if(flag==1)
                	 System.out.println("No Phythagoras Triplet found in given array");
              }
          }
    }
}
 