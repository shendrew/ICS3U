// A Shen, 20/01/2022
import java.io.*;
import java.text.*;

public class Payroll
{
    public static void main(String[] args) throws IOException
    {
        // declare BufferedReader and DecimalFormat
        BufferedReader rF = new BufferedReader(new FileReader("file4.txt"));
        NumberFormat d = new DecimalFormat("0.00");

        // declare variables
        String last, first;
        int hours;
        double rate, total=0;

        // display header
        System.out.println("Last\t\tFirst\tHours\tRate\tGross Pay");
        System.out.println();

        for (int i=0; i<12; i++)
        {
            // read employee data from file
            last=rF.readLine();
            first=rF.readLine();
            hours=Integer.parseInt(rF.readLine());
            rate=Double.parseDouble(rF.readLine());
            
            // calculate pay
            double pay;
            if (hours>40)   // overtime
            {
                pay=40*rate+(hours-40)*rate*1.5;
            }
            else    // no overtime
            {
                pay=hours*rate;
            }

            // increment total
            total+=pay;

            // display employee information
            System.out.println(last+"\t\t"+first+"\t"+hours+"\t"+d.format(rate)+"\t"+d.format(pay));
        }

        // display total payroll
        System.out.println();
        System.out.println("Total Payroll\t\t\t\t" + d.format(total));
    }
}
