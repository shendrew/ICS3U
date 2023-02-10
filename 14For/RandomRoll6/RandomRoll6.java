// A Shen, 14/10/2021
import java.math.*;

public class RandomRoll6 {
    public static void main(String[] args) {
        int counter=0;

        for (int i=0; i<100; i++)
        {
            int randNum=(int)(Math.random()*6+1);
            if (randNum==6)
            {
                counter++;
            }
        }
        
        System.out.println("Rolled 6 " + counter + " times");
    }
}
