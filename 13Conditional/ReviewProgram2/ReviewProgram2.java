// A Shen, 01/10/2021
import java.io.*;
import java.text.*;

public class ReviewProgram2 {
    public static void main(String[] args) throws IOException{

        // initialize input and decimal format
        DataInputStream input = new DataInputStream(System.in);
        NumberFormat d = new DecimalFormat("0.00");

        // declare variables
        int menuChoice;
        double mealCost=0, totalCost=0, discount=0, tip, hst;
        String isStudent;

        // print menu
        System.out.println("Welcome to Andy's Restaurant!");
        System.out.println();
        System.out.println("What would you like to order?");
        System.out.println("-------------------------------------------");
        System.out.println("|  1) Burger and Fries Combo       $6.50  |");
        System.out.println("|  2) Soup and Salad               $5.00  |");
        System.out.println("|  3) Spaghetti and Meatballs      $8.00  |");
        System.out.println("-------------------------------------------");
        System.out.println();

        // prompt user for menu choice
        System.out.print("Please select an item from our menu (whole number, 1-3): ");
        menuChoice = Integer.parseInt(input.readLine());
        System.out.println();
        
        // store cost of meal
        if (menuChoice<1 || menuChoice>3)
        {
            System.out.println("Error. Invalid menu item. Enter a number from 1-3.");
            System.exit(0);
        }
        else if (menuChoice==1)
        {
            mealCost=6.5;
        }
        else if (menuChoice==2)
        {
            mealCost=5;
        }
        else if (menuChoice==3)
        {
            mealCost=8;
        }

        // prompt user for student discount
        System.out.print("Are you a student (Y/N)? ");
        isStudent = input.readLine();
        System.out.println();
        
        // calculate discount
        if (isStudent.equalsIgnoreCase("y"))
        {
            System.out.println("You will receive a 10% discount.");
            discount=mealCost*0.1;
        }
        else if (isStudent.equalsIgnoreCase("n"))
        {
            System.out.println("Sorry, you will not receive a discount.");
        }
        else
        {
            System.out.println("Error. Invalid input. Enter 'Y' or 'N'.");
            System.exit(0);
        }
        System.out.println();

        // prompt user for tip
        System.out.print("How much would you like to tip (real number)? (15% is $" + d.format(mealCost*0.15) + ") ");
        tip = Double.parseDouble(input.readLine());
        System.out.println();
        if (tip<0)
        {
            System.out.println("Error. You can not tip a negative amount.");
            System.exit(0);
        }

        // calculate hst
        hst=mealCost*0.13;
        
        // calculate total cost
        totalCost=mealCost+hst+tip-discount;

        // print total cost
        System.out.println("Meal Cost  :      $ " + d.format(mealCost));
        System.out.println("HST        :      $ " + d.format(hst));
        System.out.println("Tip        :      $ " + d.format(tip));
        System.out.println("Discount   :    - $ " + d.format(discount));
        System.out.println("------------------------");
        System.out.println("Total Cost :      $ " + d.format(totalCost));
        System.out.println();
        System.out.println("The total cost of your meal is $" + d.format(totalCost) + ".");
    }
}
