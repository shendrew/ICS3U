// A Shen, 13/10/2021
import java.io.*;
import java.text.*;

public class CompoundIntTable {
    public static void main(String[] args) {
        NumberFormat d = new DecimalFormat("0.00");

        double bankBal=1000, intRate=2;

        System.out.println("Year\tBeginning\tInterest\tEnding");
        for (int i=1; i<=10; i++)
        {
            System.out.println(i + "\t" + d.format(bankBal) + "\t\t" + d.format(bankBal*intRate/100.0) + "\t\t" + d.format(bankBal+bankBal*intRate/100.0));
            bankBal+=bankBal*intRate/100.0;
        }
    }
}