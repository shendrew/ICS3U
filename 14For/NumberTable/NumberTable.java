// A Shen, 13/10/2021
import java.io.*;
import java.math.*;
import java.text.*;

public class NumberTable {
    public static void main(String[] args) {
        NumberFormat d = new DecimalFormat("0.000");

        System.out.println("Number\tSquare\tCube\tSqRoot\tReciprocal");
        for (int i=1; i<=10; i++)
        {
            System.out.println(i + "\t" + i*i + "\t" + i*i*i + "\t" + d.format(Math.sqrt(i)) + "\t" + d.format(1.0/i));
        }
    }
}
