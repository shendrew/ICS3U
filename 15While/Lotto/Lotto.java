// A Shen, 25/10/2021
import java.io.*;
import java.math.*;
import java.text.*;

public class Lotto {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        NumberFormat d = new DecimalFormat("###,###,###,###");

        // introduction
        System.out.println("Welcome to Lotto 649!");
        System.out.println("Match: ");
        System.out.println("\t2 numbers to win $5.");
        System.out.println("\t3 numbers to win $20.");
        System.out.println("\t4 numbers to win $10.");
        System.out.println("\t5 numbers to win $10,000.");
        System.out.println("\t6 numbers to win $1,000,000.");
        System.out.println("It costs $5 to play a game.");
        System.out.println("Your balance is $20.");

        int balance=20;
        String repeat="Y";
        
        // loops if the user decides to repeat and has enough money
        while (balance>=5 && repeat.equalsIgnoreCase("Y"))
        {
            balance-=5;

            // generate random winning numbers
            int win1=(int)(Math.random()*49+1);
            int win2=(int)(Math.random()*49+1);
            int win3=(int)(Math.random()*49+1);
            int win4=(int)(Math.random()*49+1);
            int win5=(int)(Math.random()*49+1);
            int win6=(int)(Math.random()*49+1);
            
            while (win2==win1)
            win2=(int)(Math.random()*49+1);
            while (win3==win2 || win3==win1)
                win3=(int)(Math.random()*49+1);
                while (win4==win3 || win4==win2 || win4==win1)
                win4=(int)(Math.random()*49+1);
                while (win5==win4 || win5==win3 || win5==win2 || win5==win1)
                win5=(int)(Math.random()*49+1);
            while (win6==win5 || win6==win4 || win6==win3 || win6==win2 || win6==win1)
            win6=(int)(Math.random()*49+1);
            System.out.println();

            // print winning numbers for debugging
            System.out.println("(testing):\t"+win1+"\t"+win2+"\t"+win3+"\t"+win4+"\t"+win5+"\t"+win6);
            
            // user inputs 6 numbers
            int guess1, guess2, guess3, guess4, guess5, guess6;
            System.out.println("Enter 6 unique numbers to match the winning numbers.");

            System.out.print("\nEnter number #1 (1-49): ");
            guess1=Integer.parseInt(input.readLine());
            while (guess1<1 || guess1>49)
            {
                System.out.println();
                System.out.println("Error. Input must be between 1-49.");
                System.out.print("Re-enter number #1 (1-49): ");
                guess1=Integer.parseInt(input.readLine());
            }

            System.out.print("\nEnter number #2 (1-49): ");
            guess2=Integer.parseInt(input.readLine());
            while (guess2<1 || guess2>49 || guess2==guess1)
            {
                System.out.println();
                if (guess2<1 || guess2>49)
                    System.out.println("Error. Input must be between 1-49.");
                if (guess2==guess1)
                    System.out.println("Must enter a unique number.");
                System.out.print("Re-enter number #2 (1-49): ");
                guess2=Integer.parseInt(input.readLine());
            }

            System.out.print("\nEnter number #3 (1-49): ");
            guess3=Integer.parseInt(input.readLine());
            while (guess3<1 || guess3>49 || guess3==guess2 || guess3==guess1)
            {
                System.out.println();
                if (guess3<1 || guess3>49)
                    System.out.println("Error. Input must be between 1-49.");
                if (guess3==guess2 || guess3==guess1)
                    System.out.println("Must enter a unique number.");
                System.out.print("Re-enter number #3 (1-49): ");
                guess3=Integer.parseInt(input.readLine());
            }

            System.out.print("\nEnter number #4 (1-49): ");
            guess4=Integer.parseInt(input.readLine());
            while (guess4<1 || guess4>49 || guess4==guess3 || guess4==guess2 || guess4==guess1)
            {
                System.out.println();
                if (guess4<1 || guess4>49)
                    System.out.println("Error. Input must be between 1-49.");
                if (guess4==guess3 || guess4==guess2 || guess4==guess1)
                    System.out.println("Must enter a unique number.");
                System.out.print("Re-enter number #4 (1-49): ");
                guess4=Integer.parseInt(input.readLine());
            }

            System.out.print("\nEnter number #5 (1-49): ");
            guess5=Integer.parseInt(input.readLine());
            while (guess5<1 || guess5>49 || guess5==guess4 || guess5==guess3 || guess5==guess2 || guess5==guess1)
            {
                System.out.println();
                if (guess5<1 || guess5>49)
                    System.out.println("Error. Input must be between 1-49.");
                if (guess5==guess4 || guess5==guess3 || guess5==guess2 || guess5==guess1)
                    System.out.println("Must enter a unique number.");
                System.out.print("Re-enter number #5 (1-49): ");
                guess5=Integer.parseInt(input.readLine());
            }

            System.out.print("\nEnter number #6 (1-49): ");
            guess6=Integer.parseInt(input.readLine());
            while (guess6<1 || guess6>49 || guess6==guess5 || guess6==guess4 || guess6==guess3 || guess6==guess2 || guess6==guess1)
            {
                System.out.println();
                if (guess6<1 || guess6>49)
                    System.out.println("Error. Input must be between 1-49.");
                if (guess6==guess5 || guess6==guess4 || guess6==guess3 || guess6==guess2 || guess6==guess1)
                    System.out.println("Must enter a unique number.");
                System.out.print("Re-enter number #6 (1-49): ");
                guess6=Integer.parseInt(input.readLine());
            }

            // sort winning numbers
            for (int i=0; i<5; i++)
            {
                if (win1>win2)
                {
                    int temp=win1;
                    win1=win2;
                    win2=temp;
                }
                if (win2>win3)
                {
                    int temp=win2;
                    win2=win3;
                    win3=temp;
                }
                if (win3>win4)
                {
                    int temp=win3;
                    win3=win4;
                    win4=temp;
                }
                if (win4>win5)
                {
                    int temp=win4;
                    win4=win5;
                    win5=temp;
                }
                if (win5>win6)
                {
                    int temp=win5;
                    win5=win6;
                    win6=temp;
                }
            }

            // sort user guesses
            for (int i=0; i<5; i++)
            {
                if (guess1>guess2)
                {
                    int temp=guess1;
                    guess1=guess2;
                    guess2=temp;
                }
                if (guess2>guess3)
                {
                    int temp=guess2;
                    guess2=guess3;
                    guess3=temp;
                }
                if (guess3>guess4)
                {
                    int temp=guess3;
                    guess3=guess4;
                    guess4=temp;
                }
                if (guess4>guess5)
                {
                    int temp=guess4;
                    guess4=guess5;
                    guess5=temp;
                }
                if (guess5>guess6)
                {
                    int temp=guess5;
                    guess5=guess6;
                    guess6=temp;
                }
            }

            // print winning numbers and guesses
            System.out.println();
            System.out.println("Winning numbers:\t"+win1+"\t"+win2+"\t"+win3+"\t"+win4+"\t"+win5+"\t"+win6);
            System.out.println("Your numbers:\t\t"+guess1+"\t"+guess2+"\t"+guess3+"\t"+guess4+"\t"+guess5+"\t"+guess6);

            // calculate number of matches
            int match=0;
            if (win1==guess1 || win1==guess2 || win1==guess3 || win1==guess4 || win1==guess5 || win1==guess6)
                match++;
            if (win2==guess1 || win2==guess2 || win2==guess3 || win2==guess4 || win2==guess5 || win2==guess6)
                match++;
            if (win3==guess1 || win3==guess2 || win3==guess3 || win3==guess4 || win3==guess5 || win3==guess6)
                match++;
            if (win4==guess1 || win4==guess2 || win4==guess3 || win4==guess4 || win4==guess5 || win4==guess6)
                match++;
            if (win5==guess1 || win5==guess2 || win5==guess3 || win5==guess4 || win5==guess5 || win5==guess6)
                match++;
            if (win6==guess1 || win6==guess2 || win6==guess3 || win6==guess4 || win6==guess5 || win6==guess6)
                match++;

            // determine the prize
            System.out.println();
            System.out.println(match + " match(es).");
            if (match==6)
            {
                System.out.println("You won $1,000,000!");
                balance+=1000000;
            }
            else if (match==5)
            {
                System.out.println("You won $10,000!");
                balance+=10000;
            }
            else if (match==4)
            {
                System.out.println("You won $100!");
                balance+=100;
            }
            else if (match==3)
            {
                System.out.println("You won $20!");
                balance+=20;
            }
            else if (match==2)
            {
                System.out.println("You won $5!");
                balance+=5;
            }
            else 
            {
                System.out.println("You did not win a prize.");
            }
            System.out.println("Your balance is $" + d.format(balance));

            // ask user to play again
            System.out.println();
            System.out.print("Play again for $5 (Y/N)?: ");
            repeat=input.readLine();
            while (!repeat.equalsIgnoreCase("y") && !repeat.equalsIgnoreCase("n"))
            {
                System.out.println();
                System.out.println("Must input 'Y' or 'N'.");
                System.out.print("Play again for $5 (Y/N)?: ");
                repeat=input.readLine();
            }
        }
      
        // check for insufficient funds
        if (balance<5 && repeat.equalsIgnoreCase("y"))
        {
            System.out.println();
            System.out.println("Insufficient funds, better luck next time.");
        }
    }
}