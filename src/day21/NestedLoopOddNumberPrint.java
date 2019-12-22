package day21;

public class NestedLoopOddNumberPrint {
    public static void main(String[] args) {
        for (int x = 1; x <=4 ; x++) {
            for (int i = 0; i <=10 ; i++) {
                if(i%2==1){
                    System.out.print(i+"-");
                }
            }
            System.out.println();
        }
    }
}
