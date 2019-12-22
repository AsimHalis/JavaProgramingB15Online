package day25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindLongestWordInSentence {
    public static void main(String[] args) {
        String sentence="We are trying to find longest word";
        String [] allWordt=sentence.split(" ");
        System.out.println("all word ="+Arrays.toString(allWordt));
//               all word =[We, are, trying, to, find, longest, word]
String longestWord=allWordt[0];
int maxCharCount=0;
for(String CurrentWord:allWordt){
    if(CurrentWord.length()>longestWord.length()){
        longestWord=CurrentWord;
    }
}
        System.out.println(longestWord);//longest
}
        }


