// A Shen, 22/11/2021
import java.io.*;
import java.text.*;

public class AverageArray {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        
        double userMark[]=new double [8];

        for (int i=0; i<8; i++)
        {
            System.out.print("Enter mark #" + (i+1) + " (1-100): ");
            userMark[i]=Double.parseDouble(input.readLine());
        }

        System.out.println("Marks 50 or greater:");
        for (int i=0; i<8; i++)
        {
            if (userMark[i]>=50)
            {
                System.out.println(userMark[i]);
            }
        }
    }
}
