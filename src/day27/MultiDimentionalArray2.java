package day27;

import java.util.Arrays;

public class MultiDimentionalArray2 {
    public static void main(String[] args) {
                      //      0        1         0       1      0        1       2
        String [][] names={{"Asim","Halis"},{"Zeynep","Ozde"},{"Furkan","Asaf", "Eren"}};
                   //            0                1                2
        //print :Zeynep
        System.out.println(names[1][0]);//Zeynep
        System.out.println(names[0][1]);//Halis
        System.out.println(names[2][2]);//Eren
        System.out.println(names[2][0]);//Furkan

        names[1][0]="Selmin";
        System.out.println(names[1][0]);//Selmin
        System.out.println(Arrays.toString(names[1]));//[Selmin, Ozde]
        System.out.println(Arrays.deepToString(names));//==>[[Asim, Halis], [Selmin, Ozde]]

    }
}
