package Assignments;
import java.util.*;// print 0 to 100
public class WhileLoopCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        while(num<=100){

            System.out.println(num);
            ++num;
        }
    }

}
