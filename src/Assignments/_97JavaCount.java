package Assignments;
import  java.util.Scanner;
public class _97JavaCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int lastCharIndex=word.length()-1;
        int sum=0;
        for (int x = 0; x <=lastCharIndex-3; x++) {
            String current3Char=word.substring(x,x+4);
            System.out.println(word.substring(x,x+4));
            if(current3Char.equalsIgnoreCase("java")){
              System.out.println("Bingo!! at "+x);
                ++sum;

            }

        }
        System.out.println(sum);

    }
    }
