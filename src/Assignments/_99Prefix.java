package Assignments;
import java.util.Scanner;
public class _99Prefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int lastCharIndex = str.length() - 1;
        int sum = 0;
        for (int x = 0; x <= lastCharIndex - (n - 1); x++) {
            String current3Char = str.substring(x, x + n);
            String current4Char = str.substring(0, n);
            if (current3Char.equalsIgnoreCase(current4Char)) {
                //  System.out.println("Bingo!! at "+x);
                ++sum;
            }
        }
        if(sum>=2){
            System.out.println("true");

        }
        else{
            System.out.println("false");

        }
    }
}