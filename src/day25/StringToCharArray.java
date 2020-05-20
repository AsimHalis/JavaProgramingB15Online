package day25;


import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String name="HalisCan";

        char[] allCharsinName = name.toCharArray();

        int count=0;
        for(char eachChar:allCharsinName){
            System.out.println("eachchar = "+eachChar);
           //Task: how many 'a' in the charname?
            if (eachChar=='a'){
                ++count;
            }
        }
        System.out.println("count = "+count);
        System.out.println(Arrays.toString(allCharsinName));//[H, a, l, i, s, C, a, n]
        //Task:Sort
        Arrays.sort(allCharsinName);
        System.out.println(allCharsinName);//CHaailns
        System.out.println(Arrays.toString(allCharsinName));//[A, C, a, i, m, n, s]

        }


    }

