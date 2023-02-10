// A Shen, 22/11/2021
import java.math.*;
import java.text.*;

public class Array3 {
    public static void main(String[] args) {

        // declare variables
        int randNum[] = new int[5];
        double total=0;
        NumberFormat d = new DecimalFormat("0.####");

        // assign random values
        for (int i=0; i<5; i++)
        {
            randNum[i]=(int)(Math.random()*10+1);
        }

        // sort array
        for (int i=0; i<5; i++)
        {
            for (int j=i+1; j<5; j++)
            {
                if (randNum[i]>randNum[j])
                {
                    int temp=randNum[i];
                    randNum[i]=randNum[j];
                    randNum[j]=temp;
                }
            }
        }

        // display array
        for (int i=0; i<5; i++)
        {
            System.out.print(randNum[i] + " ");
        }
        System.out.println();

        // add values to total
        for (int i=0; i<5; i++)
        {
            total+=randNum[i];
        }

        // display average
        System.out.println("The average is " + d.format(total/5));
    }
}
