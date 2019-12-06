package day08;
import  java.util.Scanner;
public class WarmUpTask {
    public static void main(String[] args) {
  Scanner vote=new Scanner(System.in);
        System.out.println("Enter your age!");
        int age= vote.nextInt();
                if(age>=18){
                    System.out.println("You are ready to vote!!!");
                }
                else{
                    System.out.println("Wait until you are 18");
                }
              //===Task-2
        Scanner number=new Scanner(System.in);
        System.out.println("Guess my Favorite Number");
        int yournumber=number.nextInt();
        int myFavoriteNumber=33;

                if(yournumber==myFavoriteNumber){
                    System.out.println("BINGO!!");
                }
                else if(yournumber>myFavoriteNumber){
                    System.out.println("Please enter less number,Try again");
                }
                else if (yournumber<myFavoriteNumber){
                    System.out.println("Please enter more number,Train again");
                }
else {
                    System.out.println("Try again later");
                }



    }
}
