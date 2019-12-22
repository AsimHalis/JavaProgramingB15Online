package Assignments;
import java.util.*;
public class _121Array_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int evenSumm=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]%2==0){
               ++evenSumm;
            }
        } System.out.println(evenSumm);
    }
}
