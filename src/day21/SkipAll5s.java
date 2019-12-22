package day21;

public class SkipAll5s {
    public static void main(String[] args) {
        for (int x = 0; x <=100 ; x++) {
            if(x%5==0){
                System.out.println("Skipping " +x);
              continue;
            }
            System.out.println(x);
        }

    }
}
