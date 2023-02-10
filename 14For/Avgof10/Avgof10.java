// A Shen, 13/10/2021
import java.io.*;
import java.text.*;

public class Avgof10 {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        NumberFormat d = new DecimalFormat("0.00");

        int totalMark=0;
        for (int i=1; i<=10; i++)
        {
            int mark;
            System.out.print("Enter mark #" + i + ": ");
            mark=Integer.parseInt(input.readLine());
            totalMark+=mark;
        }

        System.out.println("The total is " + totalMark);
        System.out.println("The average is " + d.format(totalMark/10.0));
    }
}
