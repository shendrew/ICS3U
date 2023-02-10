// A Shen, 22/11/2021
import java.io.*;

public class MenuWithMethods1 {
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
                choice1();
            else if (menuChoice == 2)
                choice2();
            else if (menuChoice == 3)
                choice3();
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

    public static void choice1()
    {
        System.out.println("You chose a cheeseburger");
    }

    public static void choice2()
    {
        System.out.println("You chose a pizza");
    }

    public static void choice3()
    {
        System.out.println("You chose roadkill- ewwwwww!!!!!");
    }
}
