package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {
        // create a variable called myStr and assign a value
        // check whether myStr value is Java
        // if true -->>  CORRECT WORD !!!!!!
        // If false  ---  SAY JAVA!!!!!!!

        String myStr = "Java";

        if (myStr.equals("Java")) {
            System.out.println("CORRECT WORD !!!!!!");
        } else {
            System.out.println(" SAY JAVA!!!!!!!");
        }
        String myStr2 = "Selenium";

        if (myStr2.equals("Java")) {
            System.out.println("CORRECT WORD !!!!!!");

        } else if (myStr2.equals("Cava")) {
            System.out.println(" Pumpkin!!");

        } else {
            System.out.println("NOT JAVA NOR PUMPKIN!!!");
        }


        // update this program to add more condition
        // using else if in the middle

        /*
         * check the value of myStr
         *  if it is Java -->> correct word
         *  else if it is Cava --->> Pumpkin!!
         *  else say NOT JAVA NOR PUMPKIN
         * */

    }
}
