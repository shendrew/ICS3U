// A Shen, 18/01/2022
import java.io.*;

public class AvgReadFile {
    public static void main(String[] args) throws IOException{
        BufferedReader rF = new BufferedReader(new FileReader("randNums.txt"));

        int mark, sum=0;
        
        for (int i=0; i<100; i++)
        {
            mark=Integer.parseInt(rF.readLine());
            System.out.println(mark);
            sum+=mark;
        }

        rF.close();
        System.out.println("The average of the 100 Random numbers is: " + sum/100.0);
    }
}