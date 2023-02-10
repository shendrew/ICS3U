// A Shen, 25/10/2021
import java.io.*;

public class AddNumbersSentinel {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        
        System.out.print("Enter a number (>1), or '0' to exit: ");
        int number = Integer.parseInt(input.readLine());

        while (number!=0)
        {
            if (number<0)
            {
                System.out.println("Error. Invalid input. Input must be positive");
            }
            else
            {
                System.out.println("The total of all the numbers from 1 to " + number + " is " + (number)*(number+1)/2);
            }

            System.out.print("Enter a number (>1), or '0' to exit: ");
            number = Integer.parseInt(input.readLine());
        }
    }
}
