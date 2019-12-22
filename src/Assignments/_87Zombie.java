package Assignments;
import java.util.Scanner;
public class _87Zombie {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        for (int z = 0; 0< inhabitants; z++) {
            System.out.println("Day "+z+" ["+inhabitants+"]");

            inhabitants=inhabitants/2;

        }
        System.out.println("---- EXTINCT ----");
    }
}
