package day27;

import java.util.Arrays;

public class MultiDimShortCutLoop {
    public static void main(String[] args) {
        int[] arr1D = {1, 2, 3};
        for (int each : arr1D) {
            System.out.print(each + " ");//==> 1 2 3

        }
        System.out.println("********8");

        for (int x = 0; x < arr1D.length; x++) {
            System.out.print(arr1D[x] + " ");//==>1 2 3
        }

            System.out.println("********");

            int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80, 90, 100}};
             for (int[] each1DArray : arr2D) {  // variable name each1DArray represents each inbdex of the 2d array
                for (int eachElement : each1DArray) { // variable name eachElement represents each element that's contain in the 2d array
                    System.out.print(eachElement + " ");//==>10 20 30 40 50 60 70 80 90 100
                }
            }

            System.out.println("***********2.way*******");


            for (int j = 0; j < arr2D.length; j++) {
                for (int k = 0; k < arr2D[j].length; k++) {
                    System.out.print(arr2D[j][k] + " ");//==>10 20 30 40 50 60 70 80 90 100
                }
            }


        }

    }
