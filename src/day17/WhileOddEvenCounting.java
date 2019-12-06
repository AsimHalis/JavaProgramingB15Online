package day17;

import day16.WhileLoopIntro;

public class WhileOddEvenCounting {
    public static void main(String[] args) {
        //Skip counting by 3 from 0 till  30
        //3 6 9 ...
        int counter = 0;
        while (counter <30) {
            //counter=counter+3
            counter += 3;

            System.out.print( " "+counter);
        }
        System.out.println();
        int counterodd=1;
        while (counterodd<49){
            counterodd+=2;
            System.out.print(" "+counterodd);
        }
        System.out.println();
        int counterEven=0;
        while (counterEven<=50) {
            System.out.println(" "+counterEven);
            counterEven += 2;

        }
        int cnt=0;
        while(cnt<=50){
            if (cnt%2==0){
                System.out.println(cnt+ " is even number");
            }
            else{
                System.out.println(cnt+ " is odd number");
            }
            ++cnt;
        }
        
        
        
        
    }
}
