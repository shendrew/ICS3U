// A Shen, 24/11/2021
import java.io.*;

public class RotatingLetters {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        String str=input.readLine();
        
        boolean good=true;
        for (int i=0; i<str.length(); i++)
        {
            String cur=str.substring(i, i+1);
            if (!(cur.equals("I") || cur.equals("O") || cur.equals("S") || cur.equals("H") || cur.equals("Z") || cur.equals("X") || cur.equals("N")))
            {
                good=false;
                break;
            }
        }

        if (good)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
