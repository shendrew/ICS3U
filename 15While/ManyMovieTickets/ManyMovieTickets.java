// A Shen, 25/10/2021
import java.io.*;

public class ManyMovieTickets {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        
        while (true)
        {
            System.out.print("Please enter your age (1-120), enter '999' to exit. ");
            int age=Integer.parseInt(input.readLine());
            if (age==999)
            {
                break;
            }
            if (age<1 || age>120)
            {
                System.out.println("Error. Invalid input. Input must be 1-120");
                continue;
            }

            if (age<=12)
            {
                System.out.println("The cost of the movie is: $6.00");
            }
            else if (age<=64)
            {
                System.out.println("The cost of the movie is: $11.00");
            }
            else
            {
                System.out.println("The cost of the movie is: $8.00");
            }
        }
    }
}
