// A Shen, 15/09/2021
import java.io.*;

public class AreaOfSquare {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);

        String sideLength;
        int numericSideLength, numericSquareArea;

        System.out.print("Please enter the length of one side of the square: ");

        // sideLength = input.readLine();
        // numericSideLength = Integer.parseInt(sideLength);

        numericSideLength = Integer.parseInt(input.readLine());

        numericSquareArea = numericSideLength * numericSideLength;

        System.out.println("The square area of " + numericSideLength + " is " + numericSquareArea);
    }
}
