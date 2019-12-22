package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] nums = {13, 34, 56, 78, 2};
        System.out.println(Arrays.toString(nums));//[13, 34, 56, 78, 2]

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));//[2, 13, 34, 56, 78]


        String[] word = {"ali baba", "way way", "can can", "kanka cumba", " ", "9", "09"};
        System.out.println(Arrays.toString(word));//[ali baba, way way, can can, kanka cumba,  , 9, 09]
        Arrays.sort(word);//[ , 09, 9, ali baba, can can, kanka cumba, way way]
        System.out.println(Arrays.toString(word));

        int[] nums2 = {13, 34, 56, 78, 2};
        int numL = nums2.length;
        String numIndex = Arrays.toString(nums2);
        System.out.println(numL);//5
        //   0123456789012345678
        System.out.println(numIndex);//  [13, 34, 56, 78, 2]
        System.out.println(numIndex.length());//19
        System.out.println(numIndex.substring(2));//3, 34, 56, 78, 2]
        System.out.println(numIndex.substring(numIndex.length() - 1));//]

        int[] nums3 = {13, 34, 56, 78, 2};
        for (int x = 0; x < nums3.length - 1; x++) {
            if (nums3[x] < nums3[x + 1]) {
                System.out.println(nums3[x] + " less then " + nums3[x + 1]);
            }

        }

    }

}