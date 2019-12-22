package Assignments;
import java.util.*;
public class _00ArrayIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] newStr = sentence.split(" ");//java is realy fun
//if String[] newStr = sentence.split(", ")==> iy means ther is no "," and whole sentence should like one wiil be one sentence

        System.out.println(sentence);//java is realy fun.........==>java is realy fun
        System.out.println(sentence.length());//17.........==>17
        System.out.println(Arrays.toString(newStr));//[java, is, realy, fun].........==>[java is realy fun]
        System.out.println(newStr.length);//4.........==>1

        for (int i = 0; i <newStr.length ; i++) {
            System.out.println(newStr[i]);      //java      ........==>java is realy fun
                                               //  is
                                              // realy
                                               //  fun
        }

       /* Muhtar s NOTE:
       Arrays.sort(newStr);
        System.out.println(sentence);//  java is realy fun .....==>java is realy fun
        System.out.println(Arrays.toString(newStr) );//  [fun, is, java, realy]...==>[java is realy fun]

        Array: a vraible that can have multiple data elemnts
        data-type[]  vairableName = {data1, data2, ...}  // data MUST match with the data type
        // index:      0      1
        vairableName[0] ==> data1
        vairableName[1] ==> data2
        for each loop: is used to access each data in the collections of data (array)
        it's a loop that's already been iterated
        numbers of execution of the loop depends on the numbers of data elemnbts
        for(data-type  each : ArrayName  ){
        }
        varoable "each" represents each elemnts of the array
        EX:
        int[] arr = {0,0,0} ;
        for(int each: arr){
            sout(each);  // gets executed 3 times, lenght of the array is 3
        }
        when do we need for each loop:
        we dont need use index numbers
        continue statement: used to skip the current iteration of the loop. jumps to the next iteration.
        break statement: exiting the loop IMMEDIETLY
*/
    }
}
