package day31;

import java.util.Arrays;

public class MethodPractice4 {
    public static void main(String[] args) {
        // no need for object when being called                : static
        // it should be accessible anywhere in your project    : public
        // it does not return any value                        : void
        // does not need any external data when being called   : (nothing inside)
        count20to1();
        System.out.println();
        count1to100Odd();
        System.out.println();
        nameSpelling();
    }
        public static void count20to1(){
            for (int i = 20; i >=1 ; i--) {
                System.out.print(i+" ");
            }
            System.out.println();
    }
    public static void count1to100Odd() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void nameSpelling(){
 String name="AsimHalis";
        System.out.println();



    }

}
