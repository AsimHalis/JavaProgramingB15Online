package day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {
        String sentence="I Love Java";
        String [] allWords=sentence.split(" ");
        System.out.println(Arrays.toString(allWords));//[I, Love, Java]
        System.out.println("How many word do I have in this sentence ="+allWords.length);
                            // How many word do I have in this sentence =3
        //How do i get the last world of the sentence using this array?
        System.out.println("Last World in this sentence = "+allWords[allWords.length-1]);//java
                           //Last World in this sentence = Java
    String sentence2="Everythimg is Awesome!!!";
    //Split by letter 'e'
        String [] splitBy_e_Array=sentence2.split("e");
        System.out.println(Arrays.toString(splitBy_e_Array));//[Ev, rythimg is Aw, som, !!!]
        for (String eachPieces:splitBy_e_Array) {
            System.out.println("each pieces = "+eachPieces);
        }//each pieces = Ev
        //each pieces = rythimg is Aw
        //each pieces = som
        //each pieces = !!!




    }
}
