package Assignments;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class SmsMessage {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
        int sendLocation1 = message.indexOf("<");
        int sendLocation2 = message.indexOf(">");
        int phoneLocation1 = message.indexOf("[");
        int phoneLocation2 = message.indexOf("]");
        int messaLocation1 = message.indexOf("{");
        int messaLocation2 = message.indexOf("}");
        System.out.println("Sender: "+message.substring(sendLocation1+1,sendLocation2));
        System.out.println("Phone Number: "+message.substring(phoneLocation1+1,phoneLocation2));
        System.out.println("Message body: "+message.substring(messaLocation1+1,messaLocation2));
        }
        }