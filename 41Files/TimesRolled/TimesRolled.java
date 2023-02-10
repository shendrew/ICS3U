// A Shen, 20/01/2022
import java.io.*;

public class TimesRolled
{
    public static void main(String[] args) throws IOException
    {
        // declare BufferedReader
        BufferedReader rF = new BufferedReader(new FileReader("dice.txt"));
        
        // declare array
        int diceCnt[]=new int[7];

        // read input from file and increment counter
        for (int i=0; i<100; i++)
        {
            diceCnt[Integer.parseInt(rF.readLine())]++;
        }

        // display counter
        display(diceCnt);
    }

    // setup display method
    public static void display(int a[])
    {
        for (int i=1; i<=6; i++)
        {
            System.out.println("The number " + i + " was rolled " + a[i] + " times.");
        }
    }
}