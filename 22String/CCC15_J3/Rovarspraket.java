// A Shen, 26/11/2021

import java.io.*;

public class Rovarspraket {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        String str=input.readLine();
        String closeVowel=" aae eei iiioo ooouu uuuuu";
        String nextCsnt=" cdf ghj klmnp qrstv wxyzz";
        
        for (int i=0; i<str.length(); i++)
        {
            char cur=str.charAt(i);

            System.out.print(cur);
            if (cur!='a' && cur!='e' && cur!='i' && cur!='o' && cur!='u')
            {
                System.out.print(closeVowel.charAt(((int)cur)-((int)'a')));
                System.out.print(nextCsnt.charAt(((int)cur)-((int)'a')));
            }
        }
        System.out.println();
    }
}
