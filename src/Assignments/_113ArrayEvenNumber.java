package Assignments;
import java.util.*;
public class _113ArrayEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        int total = 0;
        for (int i = 0; i <= 9; i++) {
            nums[i] = input.nextInt();
            if (nums[i] % 2 == 0) {
                ++total;
           }
        }
        System.out.println(total);
    }
}