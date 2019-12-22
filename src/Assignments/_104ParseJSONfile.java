package Assignments;

import java.util.Scanner;
public class _104ParseJSONfile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();

        json = json.replace(" " , "");
                System.out.println("First name: " + json.substring(json.indexOf("firstName")+13, json.indexOf("lastName")-4));

                System.out.println("Last name: " + json.substring(json.indexOf("lastName")+12, json.indexOf("role")-4));
                    }
                }
