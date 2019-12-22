package day20;

public class ForLoopFindDogInASentence {
    public static void main(String[] args) {



        String msg="I like Dog, dogs are cute,Dogs are frienty dog dog,";
        int lastCharIndex=msg.length()-1;
        int sum=0;
        for (int x = 0; x <=lastCharIndex-2; x++) {
  String current3Char=msg.substring(x,x+3);
         //   System.out.println(msg.substring(x,x+3));
       if(current3Char.equalsIgnoreCase("Dog")){
         //  System.out.println("Bingo!! at "+x);
++sum;

       }

        }
        System.out.println(sum);

    }
}
