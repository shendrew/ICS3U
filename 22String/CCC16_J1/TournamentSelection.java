// A Shen, 26/11/2021
import java.io.*;

public class TournamentSelection {
    public static void main(String args[]) throws IOException{
        DataInputStream input = new DataInputStream(System.in);

        int win=0;
        for (int i=0; i<6; i++)
        {
            String game=input.readLine();
            if (game.equals("W"))
            {
                win++;
            }
        }

        if (win>=5)
            System.out.println(1);
        else if (win>=3)
            System.out.println(2);
        else if (win>=1)
            System.out.println(3);
        else
            System.out.println(-1);
    }
}
