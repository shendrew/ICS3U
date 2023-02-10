// A Shen, 27/10/2021
import java.io.*;
import java.text.*;

public class ForeignCurrency {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        NumberFormat d = new DecimalFormat("###,###,###,##0.00");

        // display menu
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$                                       $");
        System.out.println("$    Foreign Currency Exchange Menu:    $");
        System.out.println("$    1.    Euro              1.44  CA   $");
        System.out.println("$    2.    British Pounds    1.69  CA   $");
        System.out.println("$    3.    Russian Rubles    0.018 CA   $");
        System.out.println("$    4.    US Dollars        1.24  CA   $");
        System.out.println("$    5.    Japanese Yen      0.011 CA   $");
        System.out.println("$                                       $");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        
        // prompt user for currency
        int currency=0;
        System.out.print("\nWhich currency would you like to purchase today (1-5)? : ");
        currency=Integer.parseInt(input.readLine());
        while (currency<1 || currency>5)
        {
            System.out.print("\nError. Re-enter an option between 1-5: ");
            currency=Integer.parseInt(input.readLine());
        }

        // determine currency name and exchange rate
        String currName="";
        double rate=0;
        if (currency==1)
        {
            currName="Euro";
            rate=1.44;
        }
        else if (currency==2)
        {
            currName="British Pounds";
            rate=1.69;
        }
        else if (currency==3)
        {
            currName="Russian Rubles";
            rate=0.018;
        }
        else if (currency==4)
        {
            currName="US Dollars";
            rate=1.24;
        }
        else if (currency==5)
        {
            currName="Japanese Yen";
            rate=0.011;
        }

        // prompt user for quantity of currency
        System.out.print("\nQuantity of " + currName + " (>0): ");
        double qty=Double.parseDouble(input.readLine());
        while (qty<=0)
        {
            System.out.print("\nError. Re-enter a positive quantity: ");
            qty=Double.parseDouble(input.readLine());
        }

        // display cost
        System.out.print("\nThe cost of " + d.format(qty) + " " + currName + " is: $");
        double cost=qty*rate;
        System.out.println(d.format(cost));
        
        // prompt user for their amount
        double cash;
        System.out.print("\nEnter the amount of cash given to the teller (>cost): ");
        cash=Double.parseDouble(input.readLine());
        while (cash<(int)cost)
        {
            System.out.print("\nInsufficient funds. Re-enter the amount: ");
            cash=Double.parseDouble(input.readLine());
        }

        // display change
        System.out.println("\nYour change is: " + d.format((cash-cost)));
    }
}
