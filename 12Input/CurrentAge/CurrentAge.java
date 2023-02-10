// A Shen, 15/09/2021
import java.io.*;

public class CurrentAge {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream (System.in);

        String myName, myAge;

        System.out.print("Please enter your name: ");
        myName = input.readLine();

        System.out.println("Hello " + myName + ", how are you?");

        System.out.print("Please enter your age: ");
        myAge = input.readLine();

        System.out.println(myName + ", you are " + myAge + " years old!");
    }
}
