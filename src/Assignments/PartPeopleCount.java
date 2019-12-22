package Assignments;
import java.util.*;
public class PartPeopleCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String newName="";
        String newName2="";
        String newGuest="";
        System.out.println("Please enter guest name:");
        newName = input.next();
        System.out.println("Do you want to enter new guest name:");
        newGuest = input.next();
        while (newGuest.equals("yes")) {
            System.out.println("Please enter guest name:");
            newName2 = input.next();
            System.out.println("Do you want to enter new guest name:");
            newGuest = input.next();
            newName=newName+", "+newName2;
        }
        System.out.println("Guest's list: "+newName);
    }
}





