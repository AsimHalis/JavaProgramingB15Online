package day14;
import  java.util.Scanner;
public class PasswordValidator {
    public static void main(String[] args) {
       Scanner pass=new Scanner(System.in);
        //  PASSWORD VALIDATOR
        // MINIMUM 8 CHAR MAX 16 CHAR
        // IT MUST CONTAINS _ OR $
        // IT MUST NOT CONTAINS SPACE
        // IT MUST START Ab
        System.out.println("enter your password");
        String password=pass.next();
        //min 8 char max 16 char
        boolean min8max16=password.length()>=8 &&password.length()<=16 ;
        //it must contain  _ or $
        boolean mustContain_or$=password.contains("_")||password.contains("$");
        //it must not contain space
        boolean mustNotContainSpase=!password.contains(" ");
        //it must start Ab
        boolean mustStartAb=password.startsWith("Ab");
        if (min8max16&&mustContain_or$&&mustNotContainSpase&&mustStartAb){
                System.out.println("VALID PASSWORD");
                    }
        else {
            System.out.println("INVALID PASSWORD");
        }
    }
}
