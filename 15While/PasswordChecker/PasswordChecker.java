// A Shen, 25/10/2021
import java.io.*;

public class PasswordChecker {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
    
        String password="1234qwer", answer;
        int count=3;

        System.out.print("Enter the password. You have " + count + " tries: ");
        answer=input.readLine();
    
        while (!answer.equals(password) && count>1)
        {
            System.out.println("Incorrect.");
            System.out.print("Enter the password. You have " + (count-1) + " tries left: ");
            answer=input.readLine();
            if (!answer.equals(password))
            {
                count--;
            }
        }
        
        if (count==1)
        {
            System.out.println("Attempts exceeded 3, your account is locked.");
        }
        else
        {
            System.out.println("Welcome.");
        }
    }
}
