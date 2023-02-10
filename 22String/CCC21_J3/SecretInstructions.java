// A Shen, 26/11/2021

import java.io.*;

public class SecretInstructions {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);

        String str, pre="";
        while (true)
        {
            str=input.readLine();
            if (str.equals("99999"))
            {
                break;
            }
            int dir=str.charAt(0)-'0'+str.charAt(1)-'0';
            if (dir==0)
            {
                System.out.print(pre + " " + str.substring(2,5));
            }
            else if (dir%2==0)
            {
                System.out.print("right " + str.substring(2,5));
                pre="right";
            }
            else
            {
                System.out.print("left " + str.substring(2,5));
                pre="left";
            }
            System.out.println();
        }
    }
}
