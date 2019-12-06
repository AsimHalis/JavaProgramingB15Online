package day20;

public class ForLoopReversingString {
    public static void main(String[] args) {
        // given a String variable name with value
        // reverse this name and store reversed value into
        // another String variable reversedName
        // 01234567
        String name = "Tony Stark";
        String reversedName = "";

        int lastCharIndex = name.length() - 1;

        for (int x = lastCharIndex; x >= 0; x--) {

            System.out.print(x + " index : ");

            char currentChar = name.charAt(x);
            System.out.println(currentChar);

            reversedName = reversedName + currentChar;

        }
        System.out.println("reversedName = " + reversedName);

        // This is all we needed
//        for (int x = lastCharIndex ; x >= 0 ; x-- ){
//
//            reversedName = reversedName + name.charAt( x ) ;
//
//        }
//
//        System.out.println("reversedName = " + reversedName);




    }
}
