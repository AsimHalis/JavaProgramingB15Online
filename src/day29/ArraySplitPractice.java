package day29;

import java.util.Arrays;

public class ArraySplitPractice {
    public static void main(String[] args) {
        String hero1="Superman-Clark Kent";
        String[] herosSplited=hero1.split("-");
        System.out.println(Arrays.toString(herosSplited));
                      // [Superman, Clark Kent]
        String heroCode=herosSplited[0];
        String fullName=herosSplited[1];
        System.out.println("Hero code is : "+herosSplited[0]);//Hero code is : Superman
        System.out.println("Identity is : "+herosSplited[1]);//Identity is : Clark Kent
        String hero2="Clark Kent";
String [] FullNameSplited=hero2.split(" ");
        System.out.println("Name Splitid : "+Arrays.toString(FullNameSplited));//Name Splitid : [Clark, Kent]
        String lastName=FullNameSplited[FullNameSplited.length-1];
        System.out.println("last name :"+lastName);//Kent
        String firstName=FullNameSplited[0];
        System.out.println("First name :"+firstName);
        System.out.println("full name initial is : "+fullName.charAt(0)+lastName.charAt(0));//CK





    }
}
