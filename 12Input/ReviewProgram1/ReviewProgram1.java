// A Shen, 16/09/2021
import java.util.*;
import java.text.*;

public class ReviewProgram1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat d = new DecimalFormat("0.####");

        String name;
        int days;
        double height, growthRate;

        System.out.println("Thank you for using HeightPredictor!");
        System.out.print("\nWhat is your name? ");

        name = input.nextLine();

        System.out.println("\nNice to meet you " + name + "!");

        System.out.print("\nPlease input the your current height in meters: ");
        height = input.nextDouble();
        
        System.out.print("\nPlease input the your annual growth rate in centimeters: ");
        growthRate = input.nextDouble();

        System.out.print("\nPlease input the number of days for height prediction (whole number): ");
        days = input.nextInt();

        height += growthRate*days/365/100;

        System.out.println("\nYour predicted height in " + days + " day is: " + d.format(height) + " m!");
    }
}
