// A Shen, 25/10/2021
import java.io.*;
import java.math.*;

public class GuessANumber {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        
        while (true)
        {
            int count=0, ans=(int)(Math.random()*100+1);
            while (true)
            {
                System.out.print("Enter your guess (1-100): ");
                int guess=Integer.parseInt(input.readLine());
    
                if (guess<1 || guess>100)
                {
                    System.out.println("Error. Invalid input. Input must be 1-100");
                    continue;
                }
    
                count++;
                if (guess<ans)
                {
                    System.out.println("Too Low");
                }
                else if (guess>ans)
                {
                    System.out.println("Too High");
                }
                else
                {
                    System.out.println("Correct! You guessed " + count + " times.");
                    break;
                }
            }

            System.out.print("Play again (Y/N)?");
            String playAgain=input.readLine();
            System.out.println();
            if (!(playAgain.equalsIgnoreCase("y")))
            {
                break;
            }
        }
    }
}
