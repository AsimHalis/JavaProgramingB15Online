package day27;

public class MultDimenLoopEvenNum {

    //Task:Print all  Even number...
    public static void main(String[] args) {
        int[][] ages = {{10}, {12, 13, 14, 15, 16, 17}, {19, 20, 21, 22, 23}};
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                if (ages[i][j] % 2 == 0) {
                    System.out.print(ages[i][j]+", ");
                }
            }
        }
      }
}
