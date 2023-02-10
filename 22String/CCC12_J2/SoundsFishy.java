// A Shen, 26/11/2021
import java.io.*;

import javax.lang.model.element.Element;

public class SoundsFishy {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);

        int a[]=new int[4];
        for (int i=0; i<4; i++)
        {
            a[i]=Integer.parseInt(input.readLine());
        }

        if (a[0]==a[1] && a[1]==a[2] && a[2]==a[3])
        {
            System.out.println("Fish At Constant Depth");
        }
        else if (a[0]<a[1] && a[1]<a[2] && a[2]<a[3])
        {
            System.out.println("Fish Rising");
        }
        else if (a[0]>a[1] && a[1]>a[2] && a[2]>a[3])
        {
            System.out.println("Fish Diving");
        }
        else
        {
            System.out.println("No Fish");
        }
    }
}
