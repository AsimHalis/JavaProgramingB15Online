package day12;
import  java.util.Scanner;
public class LoginTestScanner {
    public static void main(String[] args) {
        Scanner log=new Scanner(System.in);
        System.out.println("Enter your username and password");
        //username:user123, password:pass123
        String userName = log.next();
        String password = log.next();
        if (userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Login Successful");

        } else if (userName.equals("user123") && !password.equals("pass123")) {
            System.out.println("Password is not correct");
        } else if (!userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Username is not correct");
        }
        else {
            System.out.println("Username and Pasword are both not correct");
        }

    }

}
