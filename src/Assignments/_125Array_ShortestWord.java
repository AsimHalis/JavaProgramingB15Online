package Assignments;
import java.util.*;
public class _125Array_ShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
  String shortWord="";
  int shortLength=str[0].length();
        for (int x = 0; x <str.length ; x++) {
          if(shortLength>=str[x].length()){
              shortLength=str[x].length();
              shortWord=str[x];
          }
        }

        System.out.println(shortWord);


    }
}
