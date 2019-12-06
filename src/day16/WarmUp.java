package day16;
import day15.ReversingAString;

import java.util.Scanner;
public class WarmUp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your 4 charcter word");
            String word1=scan.next();
        System.out.println("world1= "+word1.charAt(0)+" "+word1.charAt(1)+" "+word1.charAt(2)+" "+word1.charAt(3));
        System.out.println("Reversing word1");
             String word2=(word1.charAt(3)+" "+word1.charAt(2)+" "+word1.charAt(1)+" "+word1.charAt(0));
        System.out.println("word2 = " + word2);
        String msg="Hello";
        msg=msg+"World";
        msg+="World";
        System.out.println(msg);

    }
}
