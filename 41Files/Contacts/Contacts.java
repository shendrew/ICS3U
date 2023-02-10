// A Shen, 20/01/2022
import java.io.*;

public class Contacts
{
    public static void main(String[] args) throws IOException{
        BufferedReader rF = new BufferedReader(new FileReader("file2.txt"));

        String lastNames[] = new String[5];
        String firstNames[] = new String[5];
        String numbers[] = new String[5];
        int ages[] = new int[5];

        for (int i=0; i<5; i++)
        {
            lastNames[i]=rF.readLine();
            firstNames[i]=rF.readLine();
            numbers[i]=rF.readLine();
            ages[i]=Integer.parseInt(rF.readLine());
        }

        for (int i=0; i<5; i++)
        {
            System.out.println(lastNames[i] + "\t" + firstNames[i] + "\t" + numbers[i] + "\t" + ages[i]);
        }
    }
}