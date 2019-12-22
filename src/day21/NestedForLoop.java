package day21;

public class NestedForLoop {
    public static void main(String[] args) {

        for (int x = 1; x <=5 ; x++) {
            System.out.print(x+" ");
        }
        System.out.println();
        for (int x = 1; x <=5 ; x++) {
            System.out.print(x+" ");
        }
        System.out.println();
        for (int x = 1; x <=5 ; x++) {
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("2.way");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }

    }
}
