package day07;
import  java.util.Scanner;
public class EmailBuilder {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name, last name, company separated by space : ");
        // String firstName,lastname, company;
        //FirstName=scan.next();
        //lastname=scan.next();
        //company=scan.next();
        String firstName=scan.next();
        String lastname=scan.next();
        String company=scan.next();
        String email = firstName+ "_"+lastname+"@"+company+".com";
       System.out.println("My name is "+firstName+" "+lastname+
                " and I work for "+company+" "+" and my email is "+email);

    }
}
