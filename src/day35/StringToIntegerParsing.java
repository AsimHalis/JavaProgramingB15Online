package day35;

import org.w3c.dom.ls.LSOutput;

import javax.print.DocFlavor;
import java.util.Arrays;

public class StringToIntegerParsing {
    public static void main(String[] args) {

        String num1Str="100";
        String num2Str="600";
        // i want to add them and give the result 700!!

        int num1=Integer.parseInt(num1Str);//100
        int num2=Integer.parseInt(num2Str);//600
        System.out.println("Sum of num1 and num2 = "+(num1+num2));//Sum of num1 and num2 = 700


  //INTERVIEW QUESTIONS!!!!
        // I have a employee ID : "FB-457"
        //	give me the employee number and store it into a number

       // String empID = "FB-457";
        /*
         * Integer class is class coming from java.lang package
         * It's primarily used for wrapping up primitive value and treat it as an object
         * what we will focus here is though
         *  many useful static methods it provide already
         *  parseInt is a static method of Integer class
         *  It will turn a String that has only numbers and return int result
         *  if we have any non-numerical character -->> It will throw NumberFormatException
         * */
        String empID = "FB-457";
        //int id = Integer.parseInt( empID.split("-")[1] ) ;//ONE SHUT!!
        String[] empIDsplit = empID.split("-");//{"FB", "457"}
        System.out.println(Arrays.toString(empID.split("-")));//[FB, 457]
        String idStr = empIDsplit[1];
        System.out.println(empIDsplit[1]);//"457"
        int id = Integer.parseInt(idStr);

        System.out.println("id = " + id);//id = 457

            System.out.println("_____----------_______");
        
        String caseNumber="IPR2012-0001";
       int year;//--get 2012 out of it

        String strYear=caseNumber.substring(3,7);
       year=Integer.parseInt(strYear);
        System.out.println("strYear = " + strYear);

             System.out.println("_____----------_______");

        System.out.println(getYear("DER2016-10133"));
        System.out.println(getYear("PIR2009-45633"));

    }
    public static int getYear(String caseNumber){
        return Integer.parseInt(caseNumber.substring(3,7));
    }



}
