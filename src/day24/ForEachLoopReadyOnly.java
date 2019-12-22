package day24;

import java.util.Arrays;

public class ForEachLoopReadyOnly {
    public static void main(String[] args) {
        int yourFavNumber=300;
        int myFavNumber=yourFavNumber;
        myFavNumber=299;
        System.out.println(yourFavNumber);
        long [] nums={10,40,20};
      //  nums[0]=nums[0]*2; nums[]*=2;

      for (int x = 0; x <3 ; x++) {
          System.out.println(nums[x]);}
        System.out.println("After we modify the value");
       // for (int x = 0; x <3 ; x++) {
            //System.out.println(nums[x]*2);
            System.out.println(Arrays.toString(nums));

     //   }

        }
    }

