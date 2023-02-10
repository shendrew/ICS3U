// A Shen, 29/09/2021
import java.util.*;
import java.text.*;

public class ResturantMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat d = new DecimalFormat("0.00");

        int menuChoice;
        double mealPrice, totalCost, hst, tip;

        System.out.println("  Sample Menu:");
        System.out.println("    1 - juice, muffin, coffee                $2.50");
        System.out.println("    2 - cereal, banana, milk                 $2.75");
        System.out.println("    3 - egg, toast, coffee                   $3.00");
        System.out.println("    4 - banana, granola, milk                $3.50");
        System.out.println("    5 - grapefruit, bacon, eggs, coffee      $5.00");
        System.out.println();
        System.out.print("Please enter your choice (1-5): ");
        menuChoice = input.nextInt();
        System.out.println();

        if (menuChoice<1 || menuChoice>5)
        {
            System.out.println("Error. Select a valid item from the menu (1-5).");
        }
        else
        {
            if (menuChoice==1)
                mealPrice=2.5;
            else if (menuChoice==2)
                mealPrice=2.75;
            else if (menuChoice==3)
                mealPrice=3;
            else if (menuChoice==4)
                mealPrice=3.5;
            else
                mealPrice=5;

            hst=mealPrice*0.13;
            tip=mealPrice*0.15;
            totalCost=mealPrice+hst+tip;
            System.out.println("Meal Cost    $" + d.format(mealPrice));
            System.out.println("HST          $" + d.format(hst));
            System.out.println("Tip          $" + d.format(tip));
            System.out.println("Total Cost   $" + d.format(totalCost));
        }
    }
}
