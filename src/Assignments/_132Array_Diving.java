package Assignments;
import java.util.*;
public class _132Array_Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      float [] score = new float[7];
        double[] score2 = new double[1];
        //WRITE YOUR CODE HERE
        Arrays.sort(score);
    float total=0;
        for (int i = 1; i <=7 ; i++) {
            System.out.println("Enter score for judge "+i+":");
            score[i-1] = input.nextFloat();
            total+=score[i-1];
        }
        Arrays.sort(score);
       double total1=0;
        for (int x = 0; x <1 ; x++) {
            System.out.println("Enter difficulty:");
            score2[x] = input.nextDouble();
            total1+=score2[x]*0.6;
        }

        Arrays.sort(score);
        double Total=0;
        Total=(total-(score[0]+score[6]))*total1;
        System.out.println(Arrays.toString(score));
        System.out.println(score[6]);
        System.out.println(score[0]);
        System.out.println(Total);
        System.out.printf("Total: %.2f", Total);
      //  System.out.printf("Total: %.2f", totTal);

    }
}
