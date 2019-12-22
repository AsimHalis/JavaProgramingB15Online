package day32;

public class NumberAction {
    public static void main(String[] args) {

        repeatString("java", 5);
        repeatString("DO NOT TOUCH WORKING CODE", 3);
        number0To50by3();//0 3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48
        print1toX(8);//0 1 2 3 4 5 6 7 8
        countDown50to0even();//50 48 46 44 42 40 38 36 34 32 30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0
        countDownFronxtoy(13,3);//12 10 8 6 4
    }

    public static void number0To50by3() {
        for (int i = 0; i < 50; i = i + 3) {
            System.out.print(i + " ");//0 3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48
        }
        System.out.println();
    }

    public static void repeatString(String strToRepait, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(strToRepait + " ");
        }
        System.out.println();
    }

    public static void print1toX(int x) {
        for (int i = 0; i <= x; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void countDown50to0even() {
        for (int i = 50; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void countDownFronxtoy(int x, int y) {
        for (int i = x; i >= y; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }




}