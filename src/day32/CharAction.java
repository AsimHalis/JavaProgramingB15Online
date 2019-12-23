package day32;

public class CharAction {
    public static void main(String[] args) {

        printAtoZ();
        printZtoA();

    }


    public static void printAtoZ() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
        public static void printZtoA(){
            for (char i = 'z'; i >= 'a'; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("change for GITHUB");


        }

    }


