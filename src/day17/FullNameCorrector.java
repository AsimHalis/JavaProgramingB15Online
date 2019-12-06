package day17;
import java.util.Scanner;
public class FullNameCorrector {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name in two world");
                                       // 012345678
        String fullname=scan.nextLine();//Asim
        int indexOfSpace=fullname.indexOf(" ");
       // System.out.println(fullname.indexOf(" "));// =>9=>bosluga kadar olan kismin indexi kac?

        String  firstName=fullname.substring(0,indexOfSpace);
          String lastName=fullname.substring(indexOfSpace+1);

        String firsNameFixed=
                firstName.toUpperCase().substring(0,1)+//A
                firstName.toLowerCase().substring(1) ;//sim
        System.out.println(firsNameFixed);//Asim
        String lastNameFixed=
                lastName.toUpperCase().substring(0,1)+
                        lastName.toLowerCase().substring(1);
        System.out.println(lastNameFixed);
        System.out.println(firsNameFixed+" "+lastNameFixed);

    }
}
