package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {
        int counter=0;
        for (int i = 1; i <= 100; i++) {
           // System.out.println(i);
            if (i % 15 == 0) {
               System.out.println(i);
                counter+=1;
                //++counter;
            }
        }
        System.out.println(counter);
    }
}