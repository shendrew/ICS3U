// A Shen, 29/09/2021
import java.util.*;

public class SpeedFinesAreNotFine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int speed, limit;
        limit = input.nextInt();
        speed = input.nextInt();

        if (speed<limit)
        {
            System.out.println("Congratulations, you are within the speed limit!");
        }
        else if (speed+20<limit)
        {
            System.out.println("You are speeding and your fine is $100.");
        }
        else if (speed+30<limit)
        {
            System.out.println("You are speeding and your fine is $270.");
        }
        else
        {
            System.out.println("You are speeding and your fine is $500.");
        }
    }
}
