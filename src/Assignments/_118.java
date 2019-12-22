package Assignments;
//port java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class _118 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] arr = new String[6];
		for (int i=0;i<6;i++){
        arr[i] = input.nextLine();
}
        for (int x = 0; x <arr.length-2 ; x++) {

            System.out.println(arr[x]+" , "+arr[x+1]+" , "+arr[x+2]);
        }



}
}
