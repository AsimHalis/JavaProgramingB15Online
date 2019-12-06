package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {

        // given a String with even number character count
// print 2 characters in one line as below example
//
// for example  :  Ayra
/*
    Ay
    yr
    ra
*/
        String name = "Ayra";
        int charCount = name.length();//4
        int x = 0;
        int lastCharIndex = charCount - 1;//4-1=3
        for (x = 0; x <= lastCharIndex - 1; x = x + 1) {
            System.out.println(name.substring(x, x + 2));
        }
        System.out.println("Getting 3 Character");
        for (x = 0; x <= lastCharIndex - 2; x = x + 1) {
            System.out.println(name.substring(x, x + 3));
        }
    }
}