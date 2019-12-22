package Assignments;
import java.util.*;
public class _115ArrayMax {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
  int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

         Arrays.sort(nums);
           System.out.println(nums[4]);

}
 }