package Assignments;
import java.util.Arrays;
import java.util.Scanner;
public class _119ArraysSplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String[] allWords = email.split("@");
      if (allWords.length == 2) {
         System.out.println("Email id: " + allWords[0]);
                System.out.println("Email domain: " + allWords[1]);
            } else {
                System.out.println("invalid email");
            }
        }

    }
