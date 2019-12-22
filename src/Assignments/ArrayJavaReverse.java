package Assignments;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayJavaReverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] arry = sentence.split(" ");

        System.out.println(Arrays.toString(arry));

        for (int i = arry.length-1; i >=0 ; i--) {
            System.out.print (arry[i]+" ");


        }
    }
}