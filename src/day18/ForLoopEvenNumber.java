package day18;

import org.w3c.dom.ls.LSOutput;

public class ForLoopEvenNumber {
    public static void main(String[] args) {

//skip counting by 5
    for( int i=0; i<100; i+=5){
        System.out.print(" "+i);  }

        System.out.println("-----even number----");
        for (int i = 0; i <100 ; i++) {//fori==>short cut!!
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }

}
