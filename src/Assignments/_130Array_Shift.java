package Assignments;
import java.util.*;
public class _130Array_Shift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }        //4,1,2,3,4
        for (int x = 0; x <nums.length ; x++) {


        int lastIndex=nums.length-1;
            int temp = nums[lastIndex];
     nums[lastIndex]=nums[lastIndex-x];
            nums[lastIndex-x]= temp;
    }
        System.out.println(Arrays.toString(nums));//[2, 3, 4, 1]
    }
}
