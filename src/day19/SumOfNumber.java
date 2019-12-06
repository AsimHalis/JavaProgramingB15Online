package day19;

public class SumOfNumber {

    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for (int x = 1; x <=10 ; x++) {
            sum=sum+x;
            System.out.println(sum);
            ++count;
        }

        System.out.println("count = "+count);
        System.out.println("Sum of Number= "+sum);
    }
}

