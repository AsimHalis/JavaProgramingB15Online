package Assignments;
import java.util.*;
public class _126ArraySplitLongWordss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        String[] newStr = str.split(", ");

        int min = str.length();

        for (int i = 0; i < newStr.length; i++) {

            if (newStr[i].length() < min) {
                min = newStr[i].length();
            }
        }

        int count = 0;

        for (int i = 0; i < newStr.length; i++) {

            if (min == newStr[i].length()) {
                count++;
            }
        }
        String[] shortW = new String[count];
        int j = 0;
        for (int i = 0; i < newStr.length; i++) {

            if (newStr[i].length() == min) {
                shortW[j] = newStr[i];
                j++;
            }
        }

        Arrays.sort(shortW);
        System.out.println(Arrays.toString(shortW));
    }
}