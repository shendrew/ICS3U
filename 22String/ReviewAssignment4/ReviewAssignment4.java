// A Shen, 06/12/2021
import java.io.*;
import java.text.*;

public class ReviewAssignment4 {
    public static void main(String[] args) throws IOException{
        
        // declaring input and decimal format
        DataInputStream input = new DataInputStream(System.in);
        NumberFormat d = new DecimalFormat("0.00");
        
        // display introduction
        System.out.println("You are graduating high school!");
        System.out.println();
        System.out.println("A minimum of 6 grade 12 credits is required.");
        System.out.println();
        System.out.print("How many grade 12 credits do you have? ");
        
        // prompt user for number of credits
        int credits;
        credits=Integer.parseInt(input.readLine());
        while (credits<6)
        {
            System.out.println();
            System.out.println("Error. You need at least 6 grade 12 credits!");
            System.out.println();
            System.out.print("Re-enter the number of grade 12 credits: ");
            credits=Integer.parseInt(input.readLine());
        }

        // prompt user for grades to store in array
        double grades[] = new double[credits];
        for (int i=0; i<credits; i++)
        {
            System.out.println();
            System.out.print("Enter grade #" + (i+1) + " (50-100): ");
            grades[i]=Double.parseDouble(input.readLine());
            while (grades[i]<50 || grades[i]>100)
            {
                System.out.println();
                System.out.println("Error. Grades must be between 50-100.");
                System.out.println();
                System.out.print("Re-enter grade #" + (i+1) + ": ");
                grades[i]=Double.parseDouble(input.readLine());
            }
        }

        // sort array largest to smallest
        for (int i=0; i<credits-1; i++)
        {
            for (int j=0; j<credits-1; j++)
            {
                if (grades[j]<grades[j+1])
                {
                    double temp=grades[j];
                    grades[j]=grades[j+1];
                    grades[j+1]=temp;
                }
            }
        }

        // display and total first 6 grades
        double total=0;
        System.out.println();
        System.out.println("Your top 6 grades are: ");
        for (int i=0; i<6; i++)
        {
            total+=grades[i];
            System.out.println((i+1) + ".\t" + d.format(grades[i]));
        }

        // calculate and display average
        double average=total/6;
        System.out.println();
        System.out.println("The average of your top 6 grades is: " + d.format(average));

        // determine awards
        System.out.println();
        if (average>=90)
        {
            System.out.println("Congratulations, you received the Award of Excellence!");
        }
        else if (average>=80)
        {
            System.out.println("Congratulations, you received the Award of Honours!");
        }
        else
        {
            System.out.println("Happy graduation!");
        }
    }
}
