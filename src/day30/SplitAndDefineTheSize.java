package day30;

import java.util.Arrays;

public class SplitAndDefineTheSize {
    public static void main(String[] args) {
        String sentence = "I love Java Java Java";

      //  String[] wordsArray = sentence.split(" ");//[I, love, Java, Java, Java]
      //  String[] wordsArray = sentence.split(" ",2);// [I, love Java Java Java]
      //  String[] wordsArray = sentence.split(" ",4); //[I, love, Java, Java Java]
        String[] wordsArray = sentence.split(" ",5);// [I, love, Java, Java, Java]

        System.out.println("wordsArray = " + Arrays.toString(wordsArray));
        System.out.println(wordsArray.length);//4




    }
}
