// Andrew Shen, 14/09/2021
import java.text.*;

public class Restaurant {
    public static void main(String[] args) {
        // set decimal place
        NumberFormat d = new DecimalFormat("#0.00");
        
        // declaration and assignment of variables
        double mealCost = 28.93,
          hstCost = mealCost*0.13,
          tipCost = mealCost*0.1,
          totalCost = mealCost+hstCost+tipCost;

        // output final bill
        System.out.println("Meal Cost    " + d.format(mealCost));
        System.out.println("HST          " + d.format(hstCost));
        System.out.println("Tip          " + d.format(tipCost));
        System.out.println("Total Bill   " + d.format(totalCost));
    }
}
