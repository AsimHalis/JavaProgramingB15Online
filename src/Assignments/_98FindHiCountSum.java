package Assignments;
import java.util.Scanner;
public class _98FindHiCountSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

       // int lastCharIndex=str.length()-1;
        int sum=0;
        for (int x = 0; x <=str.length()-2; x++) {
            String current3Char=str.substring(x,x+2);

            if(current3Char.equals("hi")){
                             ++sum;
            }

        }
        System.out.println (sum);



    }
}
