// A Shen, 27/09/2021
import java.util.*;

public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double finalCost;

        System.out.print("Enter the cost of your purchase: ");
        finalCost = input.nextDouble();

        if (finalCost>10)
        {
            finalCost -= finalCost*0.1;
        }
        
        System.out.println("The final cost is: " + finalCost);
    }
}