// A Shen, 22/11/2021

import java.io.*; 
public class SumElements 
{ 
    public static void main (String[ ] args) 
    { 
        // declare an array with x elements and assign values (see image) 
        int data[] = {3, 2, 5, 7, 9, 12, 97, 24, 54};
        int sum = 0; 
 
        // compute the sum of all elements 
        for (int i=0; i<data.length; i++)
        { 
            sum+=data[i];
        } 
 
        // display the total of all the elements in the array as shown in the output window image 
        System.out.println("The total of all the numbers is " + sum);
 
        // call the method to square the items in the array 
        squareRandom(data); 
 
        // display the squares of each element in the array as shown in output window image 
        System.out.println (); 
        System.out.println ("The square values:"); 
        System.out.println (); 

        for (int i=0; i<data.length; i++) 
        { 
            System.out.println ("The square value of Element[" + i + "] is " + data[i]); 
        } 
    }

    public static void squareRandom (int arr[])
    { 
        for (int i=0; i<arr.length; i++) 
        { 
            arr[i]=arr[i]*arr[i];
        } 
    }
}