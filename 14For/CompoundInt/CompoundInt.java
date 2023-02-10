// A Shen, 13/10/2021
import java.io.*;
import java.text.*;

public class CompoundInt {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        NumberFormat d = new DecimalFormat("0.00");

        double bankBal, intRate;

        System.out.print("Please enter the beginning bank balance: ");
        bankBal = Double.parseDouble(input.readLine());
        System.out.print("Please enter the interest rate (ie: 3.5): ");
        intRate = Double.parseDouble(input.readLine());
        System.out.println();

        for (int i=1; i<=10; i++)
        {
            bankBal+=bankBal*intRate/100;
            System.out.println("The balance after " + i + " years is " + d.format(bankBal));
        }
    }
}
