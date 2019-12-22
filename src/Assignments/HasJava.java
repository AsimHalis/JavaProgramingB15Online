package Assignments;
import java.util.Scanner;
public class HasJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //System.out.println(word.indexOf("java"));
      if(word.indexOf("java")>=0&&word.indexOf("java")<2){
          System.out.println(true);
      }
      else{
          System.out.println("false");
      }
    }

}
