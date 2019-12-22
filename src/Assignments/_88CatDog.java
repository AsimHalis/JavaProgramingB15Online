package Assignments;
import java.util.Scanner;
public class _88CatDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        for (int x = 0; x < word.length() - 2; x++) {
            if (word.substring(x, x + 3).equals("cat")){
                    countOfCats++;}
            if (word.substring(x, x + 3).equals("dog")){
                countOfDogs++;}
            }
if(countOfCats==countOfDogs){
    System.out.println("true");
        }
else{
    System.out.println("false");
}
    }

}
