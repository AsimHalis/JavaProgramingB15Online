package day17;
//import java.util.Scanner;
public class NameCorrector {
    public static void main(String[] args) {
     //   Scanner scn=new Scanner(System.in);
    //    System.out.println("What is your full name");
 // String name1=scn.next();
  //String name2-scn.next();
                  // 012345678
        String name="aSiMHaLiS";
                //1-get the first character--->make it uppercase
               //get the rest of the characters starting from 2nt character
               //then make it lowercase
               //eventually concatenate them!
        String nameFixed= (name.charAt(0)+"").toUpperCase();//A
               nameFixed=nameFixed+name.substring(1).toLowerCase();
        System.out.println("nameFixed = " + nameFixed);
        
        //2-make whole name  uppercase the get the first character
        //get the rest of the characters starting from 2nt character
        //then make it lowercase
        //eventually concatenate them!
        String nameFixed2=name.toUpperCase().substring(0,1);//A
            nameFixed2=nameFixed2+name.substring(1).toLowerCase();
        System.out.println("nameFixed2 = " + nameFixed2);
       

    }
}
