package day27;

public class multiDimenArrayLoop {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 12, 13, 14}};
        //Task:1 2 3 4 5 6 7 8 9 10 12 13 14

        for (int j = 0; j < numbers.length; j++) {
            for (int k = 0; k < numbers[j].length; k++) {
                System.out.println(numbers[j][k]);
            }
        }
    }
}