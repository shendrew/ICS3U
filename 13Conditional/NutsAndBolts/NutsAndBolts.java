// A Shen, 27/09/2021
import java.util.*;

public class NutsAndBolts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtyNuts, qtyBolts, qtyWashers;

        System.out.print("Enter the number of nuts: ");
        qtyNuts = input.nextInt();
        System.out.print("Enter the number of bolts: ");
        qtyBolts = input.nextInt();
        System.out.print("Enter the number of washers: ");
        qtyWashers = input.nextInt();

        if (qtyBolts > qtyNuts)
        {
            System.out.println("Check your order.");
        }
        else
        {
            System.out.println("Order is OK.");

            double totalCost = qtyNuts*0.08 + qtyBolts*0.06 + qtyWashers*0.03;
            System.out.println("The total cost is: " + totalCost);
        }
    }
}