package day12;
import  java.util.Scanner;
public class SeasonalCheckerIgnorCase {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your season please");
        String season=scan.next();
        if(season.equalsIgnoreCase("Spring")){
            System.out.println("Hiking,Navruz,Cool weather");
        }
        else if(season.equalsIgnoreCase("Summer")){
            System.out.println("Pool,Swimming,Beach, Vacation");
        }
        else if(season.equalsIgnoreCase("Fall")){
            System.out.println("barbecue , riding bike , JUST CODE !!!! Halloween" );
        }
        else if(season.equalsIgnoreCase("Winter")){
            System.out.println("CODE!!!!!! Ski , sledding , snowman" );
        }
        else{
            System.out.println("NOT VALID");
        }
    }
}
