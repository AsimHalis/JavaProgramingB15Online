package day16;

public class Count1To10 {
    public static void main(String[] args) {
        int counter=1;
        while(counter<=10){
           // System.out.println("counter = " + counter);
            //++counter;
            System.out.println(counter++);

        }
        int counter2=0;
        while(++counter2<=10){
            System.out.println(counter2);
        }
    }
}
