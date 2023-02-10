// A Shen, 25/10/2021
import java.io.*;
import java.text.*;

public class AvgMarksWhile {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        NumberFormat d = new DecimalFormat("0.0");

        double count=0, total=0, average;
        while (true)
        {
            System.out.print("Enter your mark (0-100) or type 999 to exit: ");
            double mark = Double.parseDouble(input.readLine());
            if (mark==999)
            {
                break;
            }
            if (mark<0 || mark>100)
            {
                System.out.println("Error. Invalid mark entered. Mark must be 0-100.");
                continue;
            }

            count++;
            total+=mark;
        }

        average=total/count;
        if (count==0)
        {
            average=0;
        }
        System.out.println("The total of the marks is " + d.format(total));
        System.out.println("The average of the marks is " + d.format(average));
    }
}
