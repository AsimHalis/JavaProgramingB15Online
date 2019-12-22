package Assignments;
import java.util.*;
public class middleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if(word.length()>=5&&word.length()%2==1){
            //for(int x=0;x<word.length()-1;++x){
                int startWord=(word.length()-1)/2-1;
                        int finishWord=(word.length()-1)/2+2;
                System.out.println(word.substring(startWord,finishWord));
            //}
        }
    else {
            System.out.println("invalid");
        }
    }

}
