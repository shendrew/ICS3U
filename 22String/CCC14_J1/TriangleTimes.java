// A Shen, 26/11/2021
import java.io.*;

public class TriangleTimes {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);

        int a=Integer.parseInt(input.readLine());
        int b=Integer.parseInt(input.readLine());
        int c=Integer.parseInt(input.readLine());

        if (a+b+c!=180)
        {
            System.out.println("Error");
        }
        else if (a==b && b==c && a==c && a==60)
        {
            System.out.println("Equilateral");
        }
        else if (a==b || a==c || b==c)
        {
            System.out.println("Isosceles");
        }
        else
        {
            System.out.println("Scalene");
        }
    }
}
