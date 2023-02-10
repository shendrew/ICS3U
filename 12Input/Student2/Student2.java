// A Shen, 15/09/2021
import java.util.*;

public class Student2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName, lastName;
        double mark1, mark2, mark3, mark4, avgMark;

        System.out.print("What is your first name? ");
        firstName = input.next();

        System.out.print("\nWhat is your last name? ");
        lastName = input.next();

        System.out.print("\nPlease enter your first mark: ");
        mark1 = input.nextDouble();

        System.out.print("\nPlease enter your second mark: ");
        mark2 = input.nextDouble();

        System.out.print("\nPlease enter your third mark: ");
        mark3 = input.nextDouble();

        System.out.print("\nPlease enter your fourth mark: ");
        mark4 = input.nextDouble();

        avgMark=(mark1+mark2+mark3+mark4)/4;

        System.out.println("\n" + firstName + " " + lastName);
        System.out.println("The average of your 4 marks is " + avgMark);
    }
}
