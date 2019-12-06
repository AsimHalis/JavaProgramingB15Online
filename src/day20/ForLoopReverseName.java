package day20;

import org.w3c.dom.ls.LSOutput;

public class ForLoopReverseName {
    public static void main(String[] args) {
               //    01234567
        String name="Jon Suow";
        System.out.println(name.charAt(7));
        System.out.println(name.charAt(6));
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(0));
        System.out.println();
        for (int x = 7; x >=0 ; x--) {
            System.out.print(x+" index : ");
            System.out.println(name.charAt(x));
        }




         }

}
