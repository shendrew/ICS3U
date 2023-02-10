// A Shen, 22/11/2021
import java.math.*;

public class Array2 {
    public static void main(String[] args) {

        // declare array
        int randNum[] = new int[10];

        // assign random values
        for (int i=0; i<10; i++)
        {
            randNum[i]=(int)(Math.random()*100+1);
        }

        // display array
        for (int i=0; i<10; i++)
        {
            System.out.print(randNum[i] + " ");
        }
        System.out.println();

        // display array in reverse
        for (int i=9; i>=0; i--)
        {
            System.out.print(randNum[i] + " ");
        }
        System.out.println();

        // display 4th element
        System.out.println(randNum[3]);
    }
}
