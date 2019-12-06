package day17;

public class WhileMonkeyLoopPractice {
    public static void main(String[] args) {
        //count 1 to 5 then count 5 tp 1
        int counter=1;
        while (counter<=5){
            System.out.print(counter+" ");
            ++counter;
        }
        System.out.println();
        System.out.println("counter after increment="+counter);
       while (counter>1){
          --counter;
          System.out.print(counter+" ");
        }
        System.out.println();
        System.out.println("counter after decrement="+ counter);
    }
}
