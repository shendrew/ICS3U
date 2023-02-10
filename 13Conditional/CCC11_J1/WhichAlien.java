// A Shen, 29/09/2021
import java.util.*;

public class WhichAlien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int antennae, eyes;
        antennae = input.nextInt();
        eyes = input.nextInt();

        if (antennae>=3 && eyes<=4)
        {
            System.out.println("TroyMartian");
        }
        if (antennae<=6 && eyes>=2)
        {
            System.out.println("VladSaturnian");
        }
        if (antennae<=2 && eyes<=3)
        {
            System.out.println("GraemeMercurian");
        }
    }
}