package day20;

public class ForLWorkingWithMoreCharinString {
    public static void main(String[] args) {
        String name="Gokyuzum";
        int charCount=name.length();
        System.out.println(name.substring(0,2));//Go
        System.out.println(name.substring(2,4));//ky
        System.out.println(name.substring(4,6));//uz
        System.out.println(name.substring(6,8));//um
        System.out.println("--------***------");
        int x=0;
        System.out.println(name.substring(x,x+2));
        x=x+2;
        System.out.println(name.substring(x,x+2));
        x=x+2;
        System.out.println(name.substring(x,x+2));
        x=x+2;
        System.out.println(name.substring(x,x+2));
        System.out.println("--------&&&&------");

        int lastCharIndex=charCount-1;
        for (x = 0; x <=lastCharIndex-1 ; x=x+2) {
            System.out.println(name.substring(x,x+2));

        }

    }
}
