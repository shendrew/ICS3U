// A Shen, 26/11/2021

import java.io.*;

public class HiddenPalindrome {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        String str=input.readLine();

        int ans=0;
        for (int i=0; i<str.length(); i++)
        {
            for (int j=i+1; j<str.length()+1; j++)
            {
                String cur=str.substring(i,j);
                Boolean good=true;
                for (int k=0; k<cur.length(); k++)
                {
                    if (cur.charAt(k)!=cur.charAt(cur.length()-1-k))
                    {
                        good=false;
                    }
                }

                if (good && cur.length()>ans)
                {
                    ans=cur.length();
                }
            }
        }

        System.out.println(ans);
    }    
}