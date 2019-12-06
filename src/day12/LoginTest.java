package day12;

public class LoginTest {
    public static void main(String[] args) {
        String userName = "user123";
        String password = "pass1234";
        if (userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Successful");

        } else if (userName.equals("user123") && !password.equals("pass123")) {
            System.out.println("Password is not correct");
        } else if (!userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Username  is not correct");
        }
        else {
            System.out.println("Username and Pasword are not correct");
        }

        }
    }