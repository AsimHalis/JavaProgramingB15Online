package day21;

public class String3CharForLoop {
    public static void main(String[] args) {
        String myName = "Amelia Israfil Hajitev mehmet Hajitev Amelia Behlia Ashr";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        System.out.println("---3 chars ---");
        //for (int x = 0; x < charCount-3 ; x++) {
        for (int x = 0; x <= lastCharIndex - 2; x++) {

            // saving the current 3 characters
            String current2Chars = myName.substring(x, x + 3);

            if (current2Chars.equalsIgnoreCase("lia")) {

                System.out.println("The index of lia is " + x);
            }
        }
    }
}