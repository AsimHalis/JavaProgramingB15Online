package Assignments;

import java.sql.SQLOutput;

public class _0AllStringMethods {
    public static void main(String[] args) {
        //char index 01234
          String s1="Halis";
       //Char Count 12345
        System.out.println("--------length()-----INT-----");

        System.out.println(s1.length());//5 or int charCount=s1.length();
        System.out.println("-------charAt(Index)---CHAR---");
        System.out.println(s1.charAt(0));//H or  char c1=s1.charAt(0);
        System.out.println(s1.charAt(3));//i
       // System.out.println(s1.charAt(6));//??

        System.out.println("--------equals()----BOOLEAN------");

        System.out.println(s1.equals("Halis"));//true or boolean b1=s1.equals("Halis");==> true
        System.out.println(s1.equals("Can"));//false or boolean b1=s1.equals("Can");  ==> false
        System.out.println("--------equalsIgnorCase()----BOOLEAN-----");
        System.out.println(s1.equalsIgnoreCase("halis"));//==> true
        System.out.println(s1.equalsIgnoreCase("HALis"));//==>true
        System.out.println("--------toLoverCase(),toUpperCase()----STRING------");
        System.out.println(s1.toLowerCase());//halis==>String loverS1=s1.toLowerCase();
        System.out.println(s1.toUpperCase());//HALIS
        String loverS1=s1.toLowerCase();
        System.out.println(loverS1);//halis

        System.out.println("--------contains()----BOOLEAN------");

        System.out.println(s1.contains("Hal"));//true
        System.out.println(s1.contains("can"));//false
        System.out.println("--------indexOf()----int------");
        System.out.println(s1.indexOf("ali"));//==>1
        System.out.println(s1.indexOf("is"));//==>3
        System.out.println(s1.indexOf("Can"));//==>-1 ==> int x1=s1.indexOf("is");
        int x1=s1.indexOf("Hal");
        System.out.println(x1);//==>0
        System.out.println(s1.indexOf("i",3));//==>3

        System.out.println("--------lastIndexOf()----int------");
                      //     0123456
                  String s2="Halliss";
        System.out.println(s2.lastIndexOf("l"));//==>3
        System.out.println(s2.lastIndexOf("s"));//==>6
        System.out.println(s2.indexOf("l"));//==>2
        System.out.println(s2.indexOf("s"));//==>5
        System.out.println(s2.lastIndexOf("l",3));//==>3
        System.out.println("-------- subString( beginningIndex, EndingIndex )---STRING---");
        System.out.println(s2.substring(2,5));//lli or String x2=s2.substring(2,5));
        System.out.println(s2.substring(4,7));//iss
        System.out.println(s2.substring(0,s2.length()));//Halliss

        System.out.println("-------- subString( beginningIndex)-----STRING-----");
                         //012345678
                String s3="Abuziddin";
        System.out.println(s3.substring(4));//iddin
        System.out.println(s3.substring(0));//Abuziddin
        System.out.println(s3.substring(s3.length()-1));//"n" or "last letter"
                 //0123456789012345678
        String s4="Abuziddin Karakalem";
        System.out.println(s4.indexOf(" "));//==>9 ( first space or second world start from index 9)
        System.out.println(s4.lastIndexOf("a"));//15
        System.out.println(s4.indexOf("a"));//11

        System.out.println("-------- isEmpty()----BOOLEAN------");

        System.out.println(s4.isEmpty());//==>false
               String s5="";
        System.out.println(s5.isEmpty());//==>true
        System.out.println("-------- startsWith(),endWith()----BOOLEAN------");
        System.out.println(s4.startsWith("Ab"));//==>true
        System.out.println(s4.startsWith("Ka"));//false
        System.out.println(s4.endsWith("m"));// true

        System.out.println("-------- trim()----STRING------");
                  //012345678901
        String s6= " Asim Halis ";
        System.out.println(s6.length());//==>12
        System.out.println(s6.trim());//Asim Halis
        System.out.println(s6.trim().length());//10

        System.out.println("-------- concat()----STRING------");

        String  s7=s6.concat(s4);
        System.out.println(s7);// Asim Halis Abuziddin Karakalem

        System.out.println("-------- Replace()----STRING------");
        String s8=s4.replace('a','O');
        System.out.println(s8);//Abuziddin KOrOkOlem
        String s9=s4.replace("Abuzid","kali");
        System.out.println(s9);





    }
}
