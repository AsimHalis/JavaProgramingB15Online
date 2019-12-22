package Assignments;
import java.util.Scanner;
public class _ArrayPrinted02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++) {
            arr[i] = input.nextLine();
        }
        for (int x = 0; x <8 ; x=x+2) {

        System.out.println(arr[x]+" , "+arr[x+1]);

    }
}
   }