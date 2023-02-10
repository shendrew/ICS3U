// A Shen, 25/10/2021
import java.io.*;

public class LoopLetterGrade {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        double mark;

        // prompt and retrieve starting value
        System.out.print("Enter your mark (0-100) or type 999 to exit: ");
        mark = Double.parseDouble(input.readLine());

        while (mark!=999)
        {
            if (mark<0 || mark>100)
            {
                System.out.println("Error. Invalid mark entered. Mark must be 0-100.");
            }
            else if (mark>=80)
            {
                System.out.println("You got an A.");
            }
            else if (mark>=70)
            {
                System.out.println("You got an B.");
            }
            else if (mark>=60)
            {
                System.out.println("You got an C.");
            }
            else if (mark>=50)
            {
                System.out.println("You got an D.");
            }
            else
            {
                System.out.println("You got an F.");
            }

            System.out.print("Enter your mark (0-100) or type 999 to exit: ");
            mark = Double.parseDouble(input.readLine());
        }
    }
}
