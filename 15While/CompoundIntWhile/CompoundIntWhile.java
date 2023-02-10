// A Shen, 25/10/2021
import java.io.*;
import java.text.*;

public class CompoundIntWhile {
    public static void main(String[] args) {
        DataInputStream input = new DataInputStream(System.in);
        NumberFormat d = new DecimalFormat("0.00");
        
        System.out.println("Year\tBeginning\tInterest\tEnding");

        double bankBal=1000;
        int year=1;
        while (true)
        {
            double interest=bankBal*0.015;
            System.out.println(year + "\t" + d.format(bankBal) + "\t\t" + d.format(interest) + "\t\t" + d.format(bankBal+interest));
            bankBal+=interest;
            year++;
            if (bankBal>=2000)
            {
                break;
            }
        }
    }
}
