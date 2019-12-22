package day22;

public class LoopingThrouhAnArrey {
    public static void main(String[] args) {
        int[] number = new int[4];
        number[0] = 60;
        number[1] = 75;
        number[2] = 88;
        number[3] = 100;
      //  System.out.println(number[0]);//12
      //  System.out.println(number[1]);//23
      //  System.out.println(number[2]);//40
      //  System.out.println(number[3]);//100
       int itemCount=number.length;
        for (int x =0; x<itemCount ; x++) {
            System.out.println(number[x]);
        }
        System.out.println("***Reverse***");
        for (int x = number.length-1; x>=0 ; x--) {
            System.out.println(number[x]);
        }



       //how do we get the char count of a String;
        String name="John Snow";
        int charCount=name.length();



    }
    }

