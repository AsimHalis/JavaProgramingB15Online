package day29;

import java.util.Arrays;

public class ArrayString200 {
    public static void main(String[] args) {
        String[] sentes=new String[300];
        String newsent="I Love Java";
        for (int x = 0; x <sentes.length ; x++) {
            sentes[x]="I Love Java";
        }

        System.out.println(Arrays.toString(sentes));


    }
}
