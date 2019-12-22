package Assignments;
import java.util.*;
public class _122Array_Dublicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};


        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    ++count;
                }
            }
            if (count == 1) {
                System.out.println(nums[i]);

            }
    }

    }
}