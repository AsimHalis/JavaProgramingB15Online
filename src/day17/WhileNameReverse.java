package day17;

public class WhileNameReverse {
    public static void main(String[] args) {
             //        0123456789  index=count-1
        String name = "Asim Halis Can";
                     //12345678910 name.length()==>count=10
        int x =name.length()-1;//9
        while (x>=0) {//(x <= name.length())

            System.out.println(name.charAt(x));
            --x;

    }
    }
}
