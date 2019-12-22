package day21;

public class LoopControlBreakStatement {
    public static void main(String[] args) {

        //   for (int x = 1; x <= 10; x++) {
        //       System.out.println(x);
        //      break;//1
        //   }
        //   for (int x = 1; x <= 10; x++) {
        //      System.out.println(x);
        //      if (x == 5) {
        //          break;//1 2 3 4 5
        //       }
        //   }
        int sum = 0;

        for (int x = 1; x <= 10; ++x) {
            sum = sum + x;
            if (sum + x > 40) {
                System.out.println(" sum = " + sum);
                break;

            }
        }
    }
}