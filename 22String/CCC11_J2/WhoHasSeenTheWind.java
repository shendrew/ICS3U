// A Shen, 26/11/2021

import java.io.*;
import java.math.*;

public class WhoHasSeenTheWind {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        int h=Integer.parseInt(input.readLine());
        int m=Integer.parseInt(input.readLine());
        
        for (int i=1; i<=m; i++)
        {
            if ((-6*(Math.pow(i,4)) + h*Math.pow(i,3) + 2*Math.pow(i,2) + i) <=0 )
            {
                System.out.println("The balloon first touches ground at hour:");
                System.out.println(i);
                return;
            }
        }
        System.out.println("The balloon does not touch ground in the given time.");
    }
}
