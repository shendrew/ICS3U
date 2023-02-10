// A Shen, 23/11/2021
import java.io.*;
import java.math.*;

public class BiggestElement
{ 
    public static void main (String[ ] args) throws IOException   
    { 
        // declare an array to store 5 elements
        int arr[]=new int[5];
 
        // call the method to have the user key in the 5 values (populate method below) 
        populate(arr);
 
        // call the method to ‘return’ the value of the largest element of the array (see below) 
        System.out.println("The largest element is: " + findBiggest(arr));
    }

    public static void populate (int item[ ]) throws IOException 
    { 
        DataInputStream input = new DataInputStream (System.in); 
        for (int i=0; i<item.length; i++)
        {
            System.out.print("Enter element #" + (i+1) + ": ");
            item[i]=Integer.parseInt(input.readLine());
        }
    }
 
    public static int findBiggest (int item[ ]) 
    {
        int largest=item[0];
        for (int i=0; i<item.length; i++)
        {
            largest=Math.max(largest, item[i]);
        }

        return largest;
    }
}