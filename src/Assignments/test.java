package Assignments;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        System.out.println(word.substring(0,1)+""+word.substring(word.length()-1));
    }

}
