package Assignments;
        import java.util.*;
public class _124ArrayReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int midlength =nums.length/2;
        int lastIndex=nums.length-1;

        for (int x = 0; x <midlength ; x++) {
            int temp = nums[x];
            nums[x]=nums[lastIndex-x];
          nums[lastIndex-x]=temp;

        }

        System.out.println(Arrays.toString(nums));

    }
}
