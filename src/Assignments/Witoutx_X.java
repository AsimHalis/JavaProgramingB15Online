package Assignments;
import java.util.Scanner;
public class Witoutx_X {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.substring(0,1).equalsIgnoreCase("x") && word.substring(word.length()-1).equalsIgnoreCase("x") ){

            System.out.println(word.substring(1,word.length()-1) );

        }else if(word.substring(0,1).equalsIgnoreCase("x") ){

            System.out.println(word.substring(1) );

        }else if(word.substring(word.length()-1).equalsIgnoreCase("x")  ){

            System.out.println(word.substring(0,word.length()-1) );

        }else{

            System.out.println(word);
        }
    }
}
