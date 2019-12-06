package day03;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class StringDataType {
    public static void main(String[] args) {

        String name="Asim H";
        int age=45;
        double height =5.87;
        char myLastNameFirstChar= 'C';
        boolean isMarried= true;
        byte childrenCount=3;
        String city="Alpharetta";

        System.out.println("My name is :"+ name );
        System.out.println("My age is :"+ age );
        System.out.println("My last name firs letter is :"+ myLastNameFirstChar );
        System.out.println("I am married :"+ isMarried );
        System.out.println("I have :" + childrenCount);
        System.out.println("I live in :"+ city );
        System.out.println("***** one line*****");
        System.out.println(("My name is :"+ name)+ ",\n"+ ("My age is :"+ age )+ ",\n"+ ("My last name firs letter is :"+ myLastNameFirstChar )+
                ",\n"+("I am married :"+ isMarried )+ ",\n"+("I have :" + childrenCount)+ ",\n"+("I live in :"+ city ));


    }
}
