package Assignments;
import java.util.*;
public class _133ArrayConverdDecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];
        for (int x = 0; x <binary.length ; x++) {

            binary[7]=decimal%2;
            binary[6] =(decimal/2)%2;
            binary[5] = (decimal/2)/2%2;
            binary[4] = ((decimal/2)/2)/2%2;
            binary[3] = ((decimal/2)/2)/2/2%2;
            binary[2] = ((decimal/2)/2)/2/2/2%2;
            binary[1] = ((decimal/2)/2)/2/2/2/2%2;
            binary[0] = ((decimal/2)/2)/2/2/2/2/2%2;
        }
        System.out.print(Arrays.toString(binary));



    }
}
