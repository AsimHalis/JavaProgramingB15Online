package day23;

public class ArraySumMiddleLast {
    public static void main(String[] args) {
        int[] number = new int[7];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;
        number[5] = 60;
        number[6] = 70;

        System.out.println("*****short cut******");
        int[] number2 = new int[]{10, 20, 30, 40, 50, 60, 70};
        int[] number3 = {10, 20, 30, 40, 50, 60, 70};
        for (int x = 0; x <= number.length - 1; ++x) {
            System.out.print(number[x] + " ");
        }
        System.out.println();
        //task:
        System.out.println(number[number.length - 1]);//last item
        System.out.println(number[number.length / 2]);//in the middle
        int sum = 0;
        for (int x = 0; x <= number.length - 1; ++x) {
            sum = sum + number[x];
        }
        System.out.println("sum = " + sum);
    }
}
