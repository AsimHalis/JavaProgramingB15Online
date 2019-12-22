package day22;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int a = 1; a <=10 ; a++) {
            System.out.println(" Multiplication Table "+a);

            for (int i = 1; i <=10 ; i++) {
                System.out.println(a+" x "+i+" = "+a*i);
            }
        }
        System.out.println();
    }
}
