package day21;

public class String2CharForLoop {
    public static void main(String[] args) {
                     //012345678
        String myName="Halis Can";
        int charCount=myName.length();
        System.out.println("charCount = " +charCount);//9
        int lastCharIndex=charCount-1;//8
        System.out.println("lastCharIndex = "+lastCharIndex);
        for (int x = 0; x <lastCharIndex; x++) {
            String currentChar=myName.substring(x,x+1);
            if(currentChar.equalsIgnoreCase("a")){
                System.out.println("The index of a or A is "+x);
            }

        }
                        //01234567890123
        String myName1 = "Hasan Mammadov";

        int charCount1 = myName1.length();
        System.out.println("charCount1 = " + charCount1);
        int lastCharIndex1 = charCount1 - 1;
        System.out.println("lastCharIndex = " + lastCharIndex1);

        System.out.println("---2 chars ---");
        //for (int x = 0; x < charCount-2 ; x++) {
        for (int x = 0; x <= lastCharIndex1 - 1; x++) {

            String current2Chars = myName1.substring(x, x + 2);

            if (current2Chars.equalsIgnoreCase("ma")) {

                System.out.println("The index of ma is " + x);

            }

        }

    }
}
