package day25;


import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String name="[AsimCan JHDHDWJK;LE89RLFKRFKLOJ;KVJ;LJ JKERJ JRJE]";

        char[] allCharsinName = name.toCharArray();

        int count=0;
        for(char eachChar:allCharsinName){
            System.out.println("eachchar = "+eachChar);
//how many 'a' in the charname?
            if (eachChar=='a'){
                ++count;
            }
        }
        System.out.println("count = "+count);
        System.out.println(Arrays.toString(allCharsinName));//[A, s, i, m, C, a, n]
        Arrays.sort(allCharsinName);
        System.out.println(allCharsinName);//ACaimns
        System.out.println(Arrays.toString(allCharsinName));//[A, C, a, i, m, n, s]

        }


    }

