// A Shen, 28/09/2021
import java.util.*;

public class TrueOfFalse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Are you a robot? (T or F) ");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("T"))
        {
            System.out.println("You shall not pass.");
        }
        else if (answer.equalsIgnoreCase("F"))
        {
            System.out.println("Welcome.");
        }
        else
        {
            System.out.println("Invalid answer");
        }
    }
}
