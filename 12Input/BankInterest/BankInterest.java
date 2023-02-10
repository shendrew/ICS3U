// A Shen, 15/09/2021
import java.util.*;

public class BankInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        double bankBal, intRate, totalInt, totalBal;

        System.out.print("Please enter your name: ");
        name = input.next();
        System.out.println("Hello " + name);

        System.out.print("Please enter you opening bank balance: $");
        bankBal = input.nextDouble();

        System.out.print("Please enter your rate of interest (ie 4.5): ");
        intRate = input.nextDouble();

        totalInt = bankBal * intRate / 100;
        System.out.println("The interest on your account is $ " + totalInt + "\n");

        totalBal = bankBal + totalInt;
        System.out.println("Your ending balance is " + totalBal);
    }
}
