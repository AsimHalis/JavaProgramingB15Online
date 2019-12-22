package day24;

import java.util.Arrays;

public class ArreyClass {
    public static void main(String[] args) {
        double[] prices = {10.56, 35.78, 50.65};
        String priceString = Arrays.toString(prices);
        System.out.println(priceString);
        System.out.println("leng of string is "+priceString.length());
     //   System.out.println(Arrays.toString(prices));

        for (int x = 0; x <priceString.length(); x++) {
            System.out.println("character at index " + x + " is= " + priceString.charAt(x));

        }
    }
}

