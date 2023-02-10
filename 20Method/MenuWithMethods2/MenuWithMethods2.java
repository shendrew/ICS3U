// A Shen, 22/11/2021
import java.io.*;

public class MenuWithMethods2 {
    public static void main(String[] args) throws IOException{
        int menuChoice;
        DataInputStream input = new DataInputStream(System.in);

        do
        {
            System.out.println();
            System.out.println("Menu Options");
            System.out.println("1. Cheeseburger");
            System.out.println("2. Pizza");
            System.out.println("3. Roadkill");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");

            menuChoice = Integer.parseInt(input.readLine());

            if (menuChoice == 1)
                choice1(menuChoice);
            else if (menuChoice == 2)
                choice2(menuChoice);
            else if (menuChoice == 3)
                choice3(menuChoice);
            else if (menuChoice == 0)
                choice0();
            else
                System.out.println("Error. Invalid number");
        }
        while (menuChoice != 0);
    }

    public static void choice0()
    {
        System.out.println("Goodbye");
    }

    public static void choice1(int menuChoice)
    {
        System.out.println("You chose menu #" + menuChoice);
    }

    public static void choice2(int menuChoice)
    {
        System.out.println("You chose menu #" + menuChoice);
    }

    public static void choice3(int menuChoice)
    {
        System.out.println("You chose menu #" + menuChoice);
    }
}
