// A Shen, 24/11/2021
import java.io.*;

public class HappyOrSad {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        String str=input.readLine();

        int happy=0, sad=0;
        for (int i=0; i<str.length()-2; i++)
        {
            if (str.substring(i, i+3).equals(":-)"))
            {
                happy++;
            }
            else if (str.substring(i, i+3).equals(":-("))
            {
                sad++;
            }
        }

        if (happy==0 && sad==0)
            System.out.println("none");
        else if (happy>sad)
            System.out.println("happy");
        else if (happy<sad)
            System.out.println("sad");
        else
            System.out.println("unsure");
    }
}
