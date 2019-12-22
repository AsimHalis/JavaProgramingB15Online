package Assignments;
import java.util.Arrays;
import java.util.Scanner;
public class _109Array01 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String[] arr = new String[5];
                for (int i=0;i<5;i++) {
                    arr[i] = input.nextLine();
        }
//String[] arr={aliveli,selami,kelami,denami,herami};

        System.out.println(Arrays.toString(arr));
     //[aliveli, selami, kelami, denami, herami]
        for (int i = 0; i <5 ; i++) {
            System.out.println(arr[i].substring(0,3));
        }
          //ali
          //sel
          //kel
          //den
          //her
    }
}
