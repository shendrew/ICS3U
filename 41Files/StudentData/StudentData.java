// A Shen, 20/01/2022
import java.io.*;
import java.text.*;

public class StudentData
{
    public static void main(String[] args) throws IOException
    {
        // declare BufferedReader and DecimalFormat
        BufferedReader rF = new BufferedReader(new FileReader("file5.txt"));
        NumberFormat d1 = new DecimalFormat("0.0");
        NumberFormat d2 = new DecimalFormat("0.00");

        // declare variables
        String last, first, gender;
        int age, grade, mathMrk, engMrk;
        double totalAvg=0;

        // display header
        System.out.println("Last Name\tFirst Name\tMath\tEnglish\tAverage");
        System.out.println();

        for (int i=0; i<11; i++)
        {
            // read student data from file
            last=rF.readLine();
            first=rF.readLine();
            age=Integer.parseInt(rF.readLine());
            gender=rF.readLine();
            grade=Integer.parseInt(rF.readLine());
            mathMrk=Integer.parseInt(rF.readLine());
            engMrk=Integer.parseInt(rF.readLine());

            // calculate average and increment class total
            double avgMrk=(mathMrk+engMrk)/2.0;
            totalAvg+=avgMrk;

            // display student information
            System.out.println(last+"\t\t"+first+"\t\t"+mathMrk+"\t"+engMrk+"\t"+d1.format(avgMrk));
        }

        // display class average
        System.out.println();
        System.out.println("Class Avg\t\t\t\t\t"+d2.format(totalAvg/11));
    }
}
