package Assignments;
import java.util.Scanner;
public class _106Vowels {
    public static void main(String[] args) {
        System.out.print("In:");
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
   String word2="";
        for (int x = 0; x <word.length() ; x++) {
            word2=word.substring(x,x+1);
            if(word2.equals("a")||word2.equals("e")||word2.equals("i")||word2.equals("u")||word2.equals("o")){
                System.out.print(word2);
       }
        }

    }
}