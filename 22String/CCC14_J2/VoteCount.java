// A Shen, 24/11/2021
import java.io.*;

public class VoteCount {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        int n=Integer.parseInt(input.readLine());
        String str=input.readLine();

        int a=0, b=0;
        for (int i=0; i<n; i++)
        {
            int cur=str.charAt(i);
            if (cur=='A')
            {
                a++;
            }
            else
            {
                b++;
            }
        }
        
        if (a>b)
        {
            System.out.println("A");
        }
        else if (a<b)
        {
            System.out.println("B");
        }
        else
        {
            System.out.println("Tie");
        }
    }
}
