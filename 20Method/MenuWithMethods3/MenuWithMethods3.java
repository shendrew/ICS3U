// A Shen, 22/11/2021
import java.io.*;
import java.text.*;

public class MenuWithMethods3 {
    public static void main(String[] args) throws IOException{
        int menuChoice;
        double cost1=12.75, cost2=10.75, cost3=1.75;

        DataInputStream input = new DataInputStream(System.in);
        
        do
        {
            System.out.println();
            System.out.println("Menu Options");
            System.out.println("1. Cheeseburger   $ 12.75");
            System.out.println("2. Pizza          $ 10.75");
            System.out.println("3. Roadkill       $  1.75");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            
            menuChoice = Integer.parseInt(input.readLine());

            if (menuChoice == 1)
                goodChoice(menuChoice, cost1);
                else if (menuChoice == 2)
                goodChoice(menuChoice, cost2);
                else if (menuChoice == 3)
                goodChoice(menuChoice, cost3);
                else if (menuChoice == 0)
                choice0();
                else
                System.out.println("Error. Invalid number");
            }
        while (menuChoice != 0);
    }
    
    public static void choice0()
    {
        System.out.println("Goodbye");
    }
    
    public static void goodChoice(int menuChoice, double cost)
    {
        NumberFormat d = new DecimalFormat("0.00");
        System.out.println("You chose menu #" + menuChoice);
        System.out.println("Meal cost   " + d.format(cost));
        System.out.println("HST         " + d.format(cost*0.13));
        System.out.println("Tip         " + d.format(cost*0.1));
        System.out.println("Total cost  " + d.format(cost*1.23));
    }
}
